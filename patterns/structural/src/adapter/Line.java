package adapter;

public class Line {

    public Point start,end;

    public Line(Point start, Point end){
        this.start = start;
        this.end = end;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj==null || getClass() != obj.getClass()) return false;

        Line line = (Line)obj;

        if(start != null ? !start.equals(line.start) : line.start !=null) return false;
        return end != null ? end.equals(line.end):line.end==null;
    }

    @Override
    public int hashCode() {
        int result = start != null ? start.hashCode() : 0;
        result = 31 * result + (end != null ? end.hashCode() : 0);
        return result;
    }
}
