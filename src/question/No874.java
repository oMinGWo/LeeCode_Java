package question;

public class No874 {

    private static final int NORTH=1;
    private static final int SOUTH=-1;
    private static final int EAST=2;
    private static final int WEST=-2;

    //TODO
    public int robotSim(int[] commands, int[][] obstacles) {
        if (commands.length==0){
            return 0;
        }
        int direction = NORTH;
        int x=0;
        int y=0;
        for (int i=0;i<commands.length;++i){
            int command = commands[i];
            if (command==-1 || command==-2){
                direction = swatchDirection(command, direction);
            }else {
                x = findNearestObstacle(x,y,direction, command, obstacles)[0];
                y = findNearestObstacle(x,y,direction, command, obstacles)[1];
            }

        }
        return x*x + y*y;
    }

    private int[] findNearestObstacle(int x, int y, int direction, int command, int[][] obstacles){
        if (direction==NORTH){
            int oldY=y;
            y+=command;
            for (int i=0;i<obstacles.length;++i){
                if (obstacles[i][0] == x && obstacles[i][1] > oldY && obstacles[i][1] < y){
                    y=obstacles[i][1];
                }
            }
            if (y!=oldY+command){
                y=y-1;
            }
        }else if (direction==SOUTH){
            int oldY=y;
            y-=command;
            for (int i=0;i<obstacles.length;++i){
                if (obstacles[i][0] == x && obstacles[i][1] < oldY && obstacles[i][1] > y){
                    y=obstacles[i][1];
                }
            }
            if (y!=oldY-command){
                y=y+1;
            }
        }else if (direction==EAST){
            int oldX=x;
            x+=command;
            for (int i=0;i<obstacles.length;++i){
                if (obstacles[i][1] == y && obstacles[i][0] > oldX && obstacles[i][0] < x){
                    x=obstacles[i][0];
                }
            }
            if (x!=oldX+command){
                x=x-1;
            }
        }else if (direction==WEST){
            int oldX=x;
            x-=command;
            for (int i=0;i<obstacles.length;++i){
                if (obstacles[i][1] == y && obstacles[i][0] < oldX && obstacles[i][0] > x){
                    x=obstacles[i][0];
                }
            }
            if (x!=oldX+command){
                x=x+1;
            }
        }

        return new int[]{x,y};
    }

    private int swatchDirection(int left, int direction){
        int newDirection = direction;
        if (left==-1){
            switch (direction){
                case NORTH: newDirection = EAST;break;
                case EAST: newDirection = SOUTH;break;
                case SOUTH: newDirection = WEST;break;
                case WEST: newDirection = NORTH;break;
                default:
            }
        }else {
            switch (direction){
                case NORTH: newDirection = WEST;break;
                case EAST: newDirection = NORTH;break;
                case SOUTH: newDirection = EAST;break;
                case WEST: newDirection = SOUTH;break;
                default:
            }
        }

        return newDirection;
    }
}
