package homework.lesson9;

public class Treugolnik {
    private int osnovanie;
    private int levayaStorona;
    private int pravayaStorona;

    public Treugolnik(){

    }

    public Treugolnik(int newOsnovanie, int newLevayaStorona, int newPravayaStorona){
        osnovanie=newOsnovanie;
        levayaStorona=newLevayaStorona;
        pravayaStorona=newPravayaStorona;
    }

    public void setOsnovanie(int osnova){
        osnovanie=osnova;
    }
    public int getOsnovanie(){
        return osnovanie;
    }
    public void setLevayaStorona(int ls){
        levayaStorona=ls;
    }
    public int getLevayaStorona(){
        return levayaStorona;
    }
    public void setPravayaStorona(int ps){
        pravayaStorona=ps;
    }
    public int getPravayaStorona(){
        return pravayaStorona;
    }
}
