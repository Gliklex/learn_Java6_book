package zadanie9_10;
/*
(3) Измените программу Music5.java, добавив в нее интерфейс Playable.
Переместите объявление play() из класса Instrument в интерфейс Playable.
Добавьте Playable к производным классам, включив его в список implements.
Измените метод tune() так, чтобы в аргументе ему передавался интерфейс Playable, а не класс Instrument.
 */

interface Playable {
    void play(Note n);
}
