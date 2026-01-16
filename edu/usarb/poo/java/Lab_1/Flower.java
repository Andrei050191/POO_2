

class Flower {
    public void fragrance() {
        System.out.println("Flower");
    }
}

class Rose extends Flower {
    public void fragrance() {
        System.out.println("Rose");
    }
}

class Lily extends Flower {
    public void fragrance() {
        System.out.println("Lily");
    }
}

class Bouquet {
    public void arrangeFlowers() {
        Flower f1 = new Rose();
        Flower f2 = new Lily();
        f1.fragrance();
        
    }
    public static void main(String[] args) {
        Bouquet bq = new Bouquet();
        bq.arrangeFlowers();
        
    }
}