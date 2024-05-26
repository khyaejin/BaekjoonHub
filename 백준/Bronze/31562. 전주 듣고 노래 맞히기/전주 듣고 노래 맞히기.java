import java.util.*;

class Song {
    String title;
    String notes;

    public Song(String title, String notes) {
        this.title = title;
        this.notes = notes;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 음을 아는 노래의 개수
        int M = scanner.nextInt(); // 맞히기를 시도할 노래의 개수

        // 노래 정보 저장
        List<Song> songs = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int T = scanner.nextInt(); // 노래 제목의 길이
            String title = scanner.next(); // 노래 제목
            StringBuilder notesBuilder = new StringBuilder(); // 노래의 음이름을 저장할 StringBuilder
            for (int j = 0; j < 7; j++) {
                notesBuilder.append(scanner.next()); // 음이름을 StringBuilder에 추가
            }
            String notes = notesBuilder.toString(); // StringBuilder를 String으로 변환하여 저장
            songs.add(new Song(title, notes));
        }

        // 정환이 맞히기를 시도할 각 노래에 대한 처리
        for (int i = 0; i < M; i++) {
            String[] notesToGuess = new String[3];
            for (int j = 0; j < 3; j++) {
                notesToGuess[j] = scanner.next();
            }
            String result = guessSong(songs, notesToGuess);
            System.out.println(result);
        }

        scanner.close();
    }

    // 노래 맞히기 메소드
    public static String guessSong(List<Song> songs, String[] notesToGuess) {
        List<String> possibleTitles = new ArrayList<>();
        for (Song song : songs) {
            String[] songNotes = song.notes.split("");
            if (Arrays.equals(Arrays.copyOfRange(songNotes, 0, 3), notesToGuess)) {
                possibleTitles.add(song.title);
            }
        }

        if (possibleTitles.isEmpty()) {
            return "!";
        } else if (possibleTitles.size() == 1) {
            return possibleTitles.get(0);
        } else {
            return "?";
        }
    }
}
