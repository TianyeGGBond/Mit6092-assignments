class Marathon {
public static void main (String[] arguments) {
    String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
    };
    int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
    };

    int minTime = Integer.MAX_VALUE;
    int secTime = Integer.MAX_VALUE;
    int num = -1;
    int secNum = -1;

    for (int i = 0; i < times.length; i++) {
        if (times[i] < minTime) {
            minTime = times[i];
            num = i;
        }
    }

        for (int i = 0; i < times.length; i++) {
            if(i == num) continue;
            if (times[i] < secTime) {
                secTime  = times[i];
                secNum  = i;
            }
        }


    System.out.println("Fastest person is " + names[num] + ", grade: " + minTime + " min");
    System.out.println("Second fast person is " + names[secNum] + ", grade: " + secTime + " min");

    }
}
