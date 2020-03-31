public class Enum
{
    enum Names
    {
        JERRY("lead guitar")
        {
            public String sings()
            {
                return "Plaintively";
            }
        },
        BOBBY("rhythm guitar")
        {
            public String sings()
            {
                return "Hoarsely";
            }
        },
        PHILL("bass");

        private String instrument;

        Names(String instrument)
        {
            this.instrument=instrument;
        }

        public String getInstrument()
        {
            return this.instrument;
        }

        public String sings()
        {
            return "occasionally";
        }
    }

    public static void main(String[] args) 
    {
        for (Names n : Names.values()) 
        {
            System.out.print(n);
            System.out.print(", instrument: "+n.getInstrument());
            System.out.println(", sings: "+n.sings());    
        }    
    }
}