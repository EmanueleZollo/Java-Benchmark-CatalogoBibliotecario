package Emanuele.entities;

public enum PublicationFrequency {
    WEEKLY {
        @Override
        public String toString() {
            return "Weekly(Settimanale)";
        }
    },
    MONTHLY{
        @Override
        public String toString() {
            return "Monthly(Mensile)";
        }
    },
    BIANNUAL{
        @Override
        public String toString() {
            return "Biannual(Semestrale)";
        }
    },
}
