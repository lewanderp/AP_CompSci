package chapter13;

public class P13_14_Class{
    
    private final char TRIED = '#';
    private final char PATH = '$'; 
    public char [][] maze  = {{'*',' ','*','*','*','*','*','*','*','*' },
                               {'*',' ','*',' ',' ',' ',' ',' ',' ','*' },
                               {'*',' ',' ',' ','*','*','*','*','*','*' },
                               {'*','*','*',' ','*',' ','*','*','*','*' },
                               {'*','*',' ',' ',' ',' ','*','*','*','*' },
                               {'*','*','*',' ','*','*','*','*','*','*' },
                               {'*',' ','*',' ','*',' ',' ',' ','*','*' },
                               {'*',' ',' ',' ',' ',' ','*',' ','*','*' },
                               {'*','*','*','*','*','*','*',' ',' ','*' },
                               {'*','*','*','*','*','*','*','*',' ','*' }};

    public P13_14_Class(){

    }
    public boolean traverse(int x, int y){
        boolean done = false;
        if (valid (x,y)){
            maze[x][y] = TRIED;
            if(x == maze.length-1 && y == maze[0].length-2){
                done = true;
            } else {
                done = traverse (x, y-1);
                if (!done){
                    done = traverse (x-1, y);
                }
                if (!done){
                    done = traverse (x, y+1);
                }
                if (!done){
                    done = traverse (x+1, y);
                }
            }
            if(done){
                maze[x][y] = PATH;
            }
        }
        return done;
    }
    private boolean valid(int x, int y){
        boolean result = false;
        if (x >= 0 && x < maze.length && y >= 0 && y < maze[x].length){
            if (maze[x][y] == ' '){
                result = true;
            }
        }
        return result;
    }
    public String toString(){
        String result = "\n";
        for(int x = 0; x < maze.length; x++){
            for (int y = 0; y < maze[x].length; y++){
                result += maze[x][y]+" ";
            }
            result += "\n";
        }
        return result;
    }
}
