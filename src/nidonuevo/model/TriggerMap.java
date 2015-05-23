/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nidonuevo.model;

/**
 *
 * @author alulab14
 */
public class TriggerMap extends Trigger {
    private int pX;
    private int pY;
    private int changeTo;
    
    public TriggerMap(int x,int y,int changeTo,int pX,int pY){
        this.x=x;
        this.y=y;
        this.changeTo=changeTo;
        this.pX=pX;
        this.pY=pY;
        this.active=true;
    }
    
    @Override
    public void execTrigger(LocalMap aThis) {
        //if(aThis.getPlayer().positionX )
        if (this.active){
            if((x==1 && aThis.getPlayer().positionX <=1) || (x==19 && aThis.getPlayer().positionX >=749) ||
                    (y==1 && aThis.getPlayer().positionY <= 1) || (y==17 && aThis.getPlayer().positionY >=645)){
                aThis.setChange(true);
            aThis.setMapAct(getChangeTo());
            aThis.getPlayer().positionX=getpX();
            aThis.getPlayer().positionY=getpY();
            }
            
        }
        
    }

    /**
     * @return the pX
     */
    public int getpX() {
        //return 0;
        return pX;
    }

    /**
     * @param pX the pX to set
     */
    public void setpX(int pX) {
        this.pX = pX;
    }

    /**
     * @return the pY
     */
    public int getpY() {
        //return 0;
        return pY;
    }

    /**
     * @param pY the pY to set
     */
    public void setpY(int pY) {
        this.pY = pY;
    }

    /**
     * @return the changeTo
     */
    public int getChangeTo() {
        //return 0;
        return changeTo;
    }

    /**
     * @param changeTo the changeTo to set
     */
    public void setChangeTo(int changeTo) {
        this.changeTo = changeTo;
    }
}