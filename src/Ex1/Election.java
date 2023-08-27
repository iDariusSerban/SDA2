package Ex1;

public class Election {
    private Candidat[] candidates;

    public Election(Candidat[] candidates) {
        this.candidates = candidates;
    }

    public boolean vote(String name) {
        // verific numele primit ca parametru in lista mea de candidati
        //daca gasesc numele, pentru candidatul respectiv cresc numarul de voturi

        for (int i = 0; i < candidates.length; i++) {
            if (name.equals(candidates[i].getName())) {
                candidates[i].setNumberOfVotes(candidates[i].getNumberOfVotes() + 1);
                return true;
            }

        }
        return false;
    }

    public void declareWinner() {
        // caut numarul cel mai mare de voturi
        //afisez numele candidatului care are cel mai mare numar de voturi
        int maxVotes = 0;
        for (int i = 0; i < candidates.length; i++) {
            if (maxVotes < candidates[i].getNumberOfVotes()) {
                maxVotes = candidates[i].getNumberOfVotes();
            }
        }
        for (int i = 0; i < candidates.length; i++) {
            if (maxVotes == candidates[i].getNumberOfVotes()) {
                System.out.println(candidates[i].getName());
            }
        }
    }
}