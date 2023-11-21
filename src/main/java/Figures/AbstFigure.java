package Figures;
import Figures.IFigure;
abstract public class AbstFigure implements IFigure {
    private String name;

    public AbstFigure (String name){
        this.name = name;
    }
  @Override
    public String getName(){
        return name;
  }
}
