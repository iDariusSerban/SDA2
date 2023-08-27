package Ex1;

public class Main {
    public static void main(String[] args) {

        Candidat candidat1 = new Candidat("Alina");
        Candidat candidat2 = new Candidat("Maria");
        Candidat candidat3 = new Candidat("Andrei");
        Candidat candidat4 = new Candidat("Mircea");

        Candidat[] candidats = {candidat1,candidat2,candidat3,candidat4};

        Election election = new Election(candidats);

        election.vote("Maria");
        election.vote("Maria");
        election.vote("Maria");
        election.vote("Andrei");
        election.vote("Andrei");
        election.vote("Mircea");

        election.declareWinner();
    }
}
