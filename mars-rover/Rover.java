
/**
 * Write a description of class Rover here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rover
{
    // instance variables
    private double x;
    private double y;
    private double distance;
    private double dir;
    private double numPics;
    public double rotation;
    private double distancex;
    private double distancey;
    private double distancerotate;
    private double distancerotater;
    private double distancerotatel;
    private String name;
    private String direction;
    private String side;
    private boolean isAlive;

    public Rover(String name)
    {
        // initialise instance variables
        this.x = 0;
        this.y = 0;
        this.dir = 0;
        this.numPics = 0;
        this.name = name;
        this.isAlive = true;
    }

    public Rover(String name, double x, double y, double dir)
    {
        this.x = x;
        this.y = y;
        this.numPics = 0;
        this.dir = dir;
        this.name = name;
        this.isAlive = true;
    }
    
    public void rotate(double rotation)
    {
       dir += rotation;
       if (rotation < 0) {
           side = "left";
       } else if (rotation > 0) {
           side = "right";
       }
       
       if (dir == 8) {
           dir = 0;
       } else if (dir == -1) {
           dir = 7;
       }
       
       System.out.println(this.name + " turned to the " + side);
    }
    
    public void move(double distance)
    {
        if (isAlive) {
           if (dir == 0) {
               y += distance;
           } else if (dir == 1) {
               x += distance;
               y += distance;
           } else if (dir == 2) {
               x += distance;
           } else if (dir == 3) {
               x += distance;
               y -= distance;
           } else if (dir == 4) {
               y -= distance;
           } else if (dir == 5) {
               x -= distance;
               y -= distance;
           } else if (dir == 6) {
               x -= distance;
           } else if (dir == 7) {
               x -= distance;
               y += distance;
           }
           System.out.println(this.name + " moved forward");
       } else {
           System.out.println(this.name + " can't move. It's ded.");
       }    
    }
    
    public void moveTo(int x, int y)
    {
        distancex = this.x - x;
        distancey = this.y - y;
        
        if (distancex > 0 && distancey > 0) {
            if (dir != 1) {
                distancerotate = Math.abs(dir - 8);
                if (distancerotate > 4) {
                    distancerotater = Math.abs(distancerotate - 8);
                    this.rotate(distancerotater);
                    System.out.println(this.name + " rotates " + distancerotater + " to the right");
                    while (this.x != x && this.y != y) {
                        this.move(distance);
                    }
                    if (this.x == x || this.y == y) {
                        this.moveTo(x, y);
                    }
                } else {
                    distancerotatel = -1 * Math.abs(distancerotate - 1);
                    this.rotate(distancerotatel);
                    System.out.println(this.name + " rotates " + distancerotatel + " to the left");
                    while (this.x != x && this.y != y) {
                        this.move(distance);
                    }
                    if (this.x == x || this.y == y) {
                        this.moveTo(x, y);
                    }
                }
            }
        } else if (distancex > 0 && distancey < 0) {
            if (dir != 3) {
                distancerotate = Math.abs(dir - 8);
                if (distancerotate > 4) {
                    distancerotater = Math.abs(distancerotate - 8);
                    this.rotate(distancerotater);
                    System.out.println(this.name + " rotates " + distancerotater + " to the right");
                    while (this.x != x && this.y != y) {
                        this.move(distance);
                    }
                    if (this.x == x || this.y == y) {
                        this.moveTo(x, y);
                    }
                } else {
                    distancerotatel = -1 * Math.abs(distancerotate - 3);
                    this.rotate(distancerotatel);
                    System.out.println(this.name + " rotates " + distancerotatel + " to the left");
                    while (this.x != x && this.y != y) {
                        this.move(distance);
                    }
                    if (this.x == x || this.y == y) {
                        this.moveTo(x, y);
                    }
                }
            }
        } else if (distancex < 0 && distancey < 0) {
            if (dir != 5) {
                distancerotate = Math.abs(dir - 8);
                if (distancerotate > 4) {
                    distancerotater = Math.abs(distancerotate - 8);
                    this.rotate(distancerotater);
                    System.out.println(this.name + " rotates " + distancerotater + " to the right");
                    while (this.x != x && this.y != y) {
                        this.move(distance);
                    }
                    if (this.x == x || this.y == y) {
                        this.moveTo(x, y);
                    }
                } else {
                    distancerotatel = -1 * Math.abs(distancerotate - 5);
                    this.rotate(distancerotatel);
                    System.out.println(this.name + " rotates " + distancerotatel + " to the left");
                    while (this.x != x && this.y != y) {
                        this.move(distance);
                    }
                    if (this.x == x || this.y == y) {
                        this.moveTo(x, y);
                    }
                }
            }
        } else if (distancex < 0 && distancey > 0) {
            if (dir != 7) {
                distancerotate = Math.abs(dir - 8);
                if (distancerotate > 4) {
                    distancerotater = Math.abs(distancerotate - 8);
                    this.rotate(distancerotater);
                    System.out.println(this.name + " rotates " + distancerotater + " to the right");
                    while (this.x != x && this.y != y) {
                        this.move(distance);
                    }
                    if (this.x == x || this.y == y) {
                        this.moveTo(x, y);
                    }
                } else {
                    distancerotatel = -1 * Math.abs(distancerotate - 7);
                    this.rotate(distancerotatel);
                    System.out.println(this.name + " rotates " + distancerotatel + " to the left");
                    while (this.x != x && this.y != y) {
                        this.move(distance);
                    }
                    if (this.x == x || this.y == y) {
                        this.moveTo(x, y);
                    }
                }
            }
        }
    }
    
    public void teleport(int x, int y)
    {
        this.x = x;
        this.y = y;
        System.out.println(this.name + " teleports to (" + x + "," + y + ").");
    }
    
    private void getDirectionName()
    {
        if (dir == 0) {
            this.direction = "North";
        } else if (dir == 1) {
            this.direction = "Northeast";
        } else if (dir == 2) {
            this.direction = "East";
        } else if (dir == 3) {
            this.direction = "Southeast";
        } else if (dir == 4) {
            this.direction = "South";
        } else if (dir == 5) {
            this.direction = "Southwest";
        } else if (dir == 6) {
            this.direction = "West";
        } else if (dir == 7) {
            this.direction = "Northwest";
        }
    }
    
    public void takePicture() {
        numPics += 1;
        
        System.out.println(this.name + " took a picture at [" + this.x + ", " + this.y + "] facing " + this.direction);
    }
    
    public void transmitPictures() {
        numbPics = 0
    
    public void kill(Rover other) {
        System.out.println(this.name + " shoots " + other.name + " with space lasers.");
        System.out.println(other.name + " goes 'beep beep aaaaaaakkkkkk!' and dies");
        
        other.isAlive = false;
    }
    
    public void revive(Rover other) {
        System.out.println(this.name + " revives " + other.name + " with magik.");
        System.out.println(other.name + " goes 'beep bop eeeeeeeeekkkkkk!' and comes back to life");
    }
    
    public String toString() {
        getDirectionName();
        return "Rover[name=" + name + ",x=" + x + ",y=" + y + 
               ",dir=" + direction + ",isAlive=" + isAlive + "]";
    }
}
