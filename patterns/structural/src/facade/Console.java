package facade;

import java.util.ArrayList;
import java.util.List;

public class Console {

    private List<ViewPort> viewPorts = new ArrayList<>();
    int width, height;

    public Console(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void addViewPort(ViewPort viewPort){
        viewPorts.add(viewPort);
    }

    public static Console newConsole(int width, int height){
        Buffer buffer = new Buffer(height, width);
        ViewPort viewPort = new ViewPort(buffer, width, height, 0, 0);
        Console console = new Console(width, height);
        console.addViewPort(viewPort);
        return console;
    }

    public void render(){
        for (int y=0;y<height;y++){
            for(int x=0; x<width; x++){
                for(ViewPort vp:viewPorts){
                    System.out.print(vp.charAt(x,y));
                }
            }
            System.out.println();
        }
    }

}
