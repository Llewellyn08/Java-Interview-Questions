package AbstractionConcept;

public class TestBank {

    public static void main(String[] args) {

        HDFCBank hb = new HDFCBank();

        hb.credit();
        hb.debit();
        hb.loan();
        hb.funds();

        Bank b = new HDFCBank();
        b.credit();
        b.debit();
        b.loan();
        //b.funds(); -- Not possible

        // Bank b1 = new Bank(); -- Not possible

    }
}
