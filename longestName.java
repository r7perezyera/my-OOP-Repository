    private static void longestName(Scanner console, int n) {       // rename to "findLongest"
        System.out.print("name #1? ");
        String longName = console.next();
        int lenName = longName.length();
        boolean tie;

        int i = 2;
        while(i <= n) {
            System.out.print("name #" + i + "? ");
            String nuevo = console.next();
            int lenNuevo = nuevo.length();
            if(lenNuevo > lenName) {
                longName = nuevo;
                lenName = lenNuevo;
            }
            i++;
        }


        longName = longName.toLowerCase();
        char firstLetter = Character.toUpperCase(longName.charAt(0));
        String longNameF = (firstLetter + longName.substring(1));

        System.out.println(longNameF + "'s name is longest");

    }
