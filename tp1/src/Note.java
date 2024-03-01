public class Note implements Comparable<Note> {

    private String intitule;
    private  float note;

    public Note(String intitule, float note) {
        super();
        this.intitule = intitule;
        this.note = note;
    }
    public String getIntitule() {
        return intitule;
    }
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }
    /*public double getNote() {
        return note;
    }
    public void setNote(double note) {
        this.note = note;
    }*/
    public float getNote() {
        return note;
    }
    public void setNote(float note) {
        this.note = note;
    }
    @Override
    public int compareTo(Note o) {
        // TODO Auto-generated method stub
        if(this.note==o.getNote())
        {
            return 0;
        }
        else if(this.note<o.getNote()) {
            return -1;
        }
        else
        {
            return 1;
        }
    }




}
