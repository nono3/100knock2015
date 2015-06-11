# coding:utf-8

import subprocess
from kajiwara_40 import Morph


class Chunk:
    def __init__(self, phrase_number, phrases, relations):
        self.morphs = [Morph(line) for line in phrases[phrase_number]]
        self.dst = relations[phrase_number][-1]
        self.srcs = [source for source, destination in relations if destination == phrase_number]
        if not self.srcs:
            self.srcs = [-1]

    def is_verbal_phrase(self):
        if [morph.pos for morph in self.morphs if morph.pos == "動詞"]:
            return True
        else:
            return False

    def get_first_verb(self):
        return [morph.base for morph in self.morphs if morph.pos == "動詞"][0]

    def get_particle(self):
        particles = [morph.surface for morph in self.morphs if morph.pos == "助詞"]
        if not particles:
            return None
        else:
            return particles[0]

    def get_src_particles(self, sentences, sentence_number):
        return [sentences[sentence_number][source_number].get_particle() for source_number in self.srcs if sentences[sentence_number][source_number].get_particle() and not source_number == -1]


def renew_phrase(phrase, phrases):
    if phrase:
        phrases.append(phrase)
        phrase = list()
    return phrase, phrases


def get_chunks_list(fname):
    fin = open(fname, "r")
    phrase = list()
    phrases = list()
    relations = list()
    sentences = list()
    for line in fin:
        if line.startswith("* "):
            phrase, phrases = renew_phrase(phrase, phrases)
            relations.append(tuple([int(number.replace("D", "")) for number in line.strip().split(" ")[1:3]]))
        elif line == "EOS\n":
            phrase, phrases = renew_phrase(phrase, phrases)
            sentences.append([Chunk(phrase_number, phrases, relations) for phrase_number in range(len(relations))])
            phrases = list()
            relations = list()
        else:
            phrase.append(line)
    fin.close()
    return sentences


def main():
    fname = "/Users/moguranosenshi/WorkSpace/100knock2015/kajiwara/data/neko.txt.cabocha"
    dname = "/Users/moguranosenshi/WorkSpace/100knock2015/kajiwara/data/"
    fo_name = "case_pattern.txt"
    fout = open(dname+fo_name, "w")
    sentences = get_chunks_list(fname)
    for sentence_number in range(len(sentences)):
        for phrase_number in range(len(sentences[sentence_number])):
            if not sentences[sentence_number][phrase_number].is_verbal_phrase():
                continue
            predicate = sentences[sentence_number][phrase_number].get_first_verb()
            particles = sentences[sentence_number][phrase_number].get_src_particles(sentences, sentence_number)
            fout.write(predicate + "\t" + " ".join(sorted(particles)) + "\n")
    fout.close()
    subprocess.call("sort "+dname+fo_name+" | uniq -c | sort -nr > "+dname+"high_freq_"+fo_name, shell=True)
    query = "する"
    subprocess.call("grep '^"+query+"\t' "+dname+fo_name+" | sort | uniq -c | sort -nr > "+dname+"high_freq_"+query+"_"+fo_name, shell=True)
    query = "見る"
    subprocess.call("grep '^"+query+"\t' "+dname+fo_name+" | sort | uniq -c | sort -nr > "+dname+"high_freq_"+query+"_"+fo_name, shell=True)
    query = "与える"
    subprocess.call("grep '^"+query+"\t' "+dname+fo_name+" | sort | uniq -c | sort -nr > "+dname+"high_freq_"+query+"_"+fo_name, shell=True)


if __name__ == '__main__':
    main()
