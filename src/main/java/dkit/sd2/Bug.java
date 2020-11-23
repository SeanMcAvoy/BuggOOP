package dkit.sd2;

import java.util.Objects;

/**
 * Second version of Bug - uses enum Direction as datatype of direction instance variable.
 * Uses static Counter to give each new Bug an id
 */
public class Bug
{

    private String id;
    private int position;
    private Direction direction;
    private static int counter = 0;

    public Bug(int initialPosition)
    {
        counter++;
        this.id = "B" + counter;
        this.position = initialPosition;
        this.direction = Direction.RIGHT;
    }

    public int getPosition()
    {
        return this.position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getId()
    {
        return id;
    }

    public void turn()
    {
        if (this.direction == Direction.RIGHT)
        {
            this.direction = Direction.LEFT;
        }
        else
        {
            this.direction = Direction.RIGHT;
        }
    }

    /**
     * Move Bug object one place along line in direction it's facing
     * If R then plus, if L then minus
     */
    public void move()
    {
        if (this.direction == Direction.RIGHT)
        {
            this.position += 1;
        }
        else
        {
            this.position -= 1;
        }
    }

    public Direction getDirection()
    {
        return this.direction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        Bug bug = (Bug) o;
        return position == bug.position &&

                direction == bug.direction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPosition(), getDirection());
    }

    @Override
    public String toString()
    {
        return getClass().getSimpleName()+"{" +
                "id=" + id +
                ", position=" + position +
                ", direction=" + direction +
                '}';
    }

}

