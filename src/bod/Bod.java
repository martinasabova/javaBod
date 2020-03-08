package bod;

public interface Bod
{
    float getX();
    float getY();
    float [] getXY();
    void setX(float _x);
    void setY(float _y);
    void setXY(float ... suradnice);
    double getDistance(Bod other);
    Bod plus(Bod other);
    Bod minus(Bod other);
    boolean equals(Bod other);
    String toString();
}
