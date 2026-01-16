

public abstract class CandyBox {
        private String flavor;
        private String origin;

        public CandyBox() {
            this.flavor = "Unknown";
            this.origin = "Unknown";
        }

        public CandyBox(String flavor, String origin) {
            this.flavor = flavor;
            this.origin = origin;
        }

        public abstract float getVolume();

        @Override
        public String toString() {
            return "The " + origin + " " + flavor;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            CandyBox candyBox = (CandyBox) obj;
            return flavor.equals(candyBox.flavor) && origin.equals(candyBox.origin);
        }
}

