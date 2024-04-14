scales = {
    "Ab": 11,
    "A": 0,
    "A#": 1,
    "Bb": 1,
    "B": 2,
    "B#": 3,
    "Cb": 2,
    "C": 3,
    "C#": 4,
    "Db": 4,
    "D": 5,
    "D#": 6,
    "Eb": 6,
    "E": 7,
    "E#": 8,
    "Fb": 7,
    "F": 8,
    "F#": 9,
    "Gb": 9,
    "G": 10,
    "G#": 11,
}
scales_index = ["A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"]

while True:
    order = list(input().split())
    if order[0] == "***":
        break

    transposition = int(input())
    result = []
    for i in order:
        m = scales[i] + transposition
        result.append(scales_index[m % 12])

    print(" ".join(result))
