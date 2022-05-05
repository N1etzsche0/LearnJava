import java.util.TreeSet;

class R implements Comparable {
    int count;

    public R(int count) {
        this.count = count;
    }

    public String toString() {
        return "R[count:" + count + "]";
    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == R.class) {
            var r = (R) obj;
            return r.count == this.count;
        }
        return false;
    }
}

public class No11 {
    public static void main(String[] args) {
        var ts = new TreeSet<>();
        ts.add(new R(5));
        ts.add(new R(-3));
        ts.add(new R(9));
        ts.add(new R(-2));
        System.out.println(ts);
        var first = (R) ts.last();
        first.count = 20;
        var last = (R) ts.last();
        last.count = -2;
        System.out.println(ts);
        System.out.println(ts.remove(new R(-2)));
        System.out.println(ts);
        System.out.println(ts.remove(new R(5)));
        System.out.println(ts);
    }
}