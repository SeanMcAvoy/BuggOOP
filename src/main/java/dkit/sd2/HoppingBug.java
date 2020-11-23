package dkit.sd2;

import java.util.Objects;

public class HoppingBug extends Bug
{
    private int hoppingDistance;

    public HoppingBug(int initialPosition,int hoppingDistance)
    {
        super(initialPosition);
        this.hoppingDistance = hoppingDistance;
    }

    public int getHoppingDistance() {
        return hoppingDistance;
    }

    public void setHoppingDistance(int hoppingDistance) {
        this.hoppingDistance = hoppingDistance;
    }

    public void move()
    {
        if (this.getDirection() == Direction.RIGHT)
        {
            this.setPosition(this.getPosition() + hoppingDistance);

        }
        else
        {
            this.setPosition(this.getPosition() - hoppingDistance);

        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof HoppingBug))
            return false;
        if (!super.equals(o))
            return false;
        HoppingBug that = (HoppingBug) o;
        return hoppingDistance == that.hoppingDistance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hoppingDistance);
    }

    @Override
    public String toString() {
        return super.toString()+"{ hoppingDistance "+ hoppingDistance +" }";
    }
}
