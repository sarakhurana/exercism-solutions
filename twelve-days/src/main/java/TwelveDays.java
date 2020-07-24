class TwelveDays {
    private String[] days={"first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth" };
    private String[] things={"a Partridge in a Pear Tree","two Turtle Doves","three French Hens","four Calling Birds","five Gold Rings","six Geese-a-Laying","seven Swans-a-Swimming","eight Maids-a-Milking","nine Ladies Dancing","ten Lords-a-Leaping","eleven Pipers Piping","twelve Drummers Drumming"};
    String verse(int verseNumber) {
        if(verseNumber==1)
            return  "On the "+ days[0]+ " day of Christmas my true love gave to me: " +things[0]+".\n";
        String line="On the "+ days[verseNumber-1]+ " day of Christmas my true love gave to me: ";
        for(int i=verseNumber-1;i>0;i--)
        {
         line+=things[i]+", ";
        }
        line+="and "+things[0]+".\n";
        return line;
    }

    String verses(int startVerse, int endVerse) {
        String lyrics="";
        for(int i=startVerse;i<endVerse;i++)
        {
         lyrics+= verse(i)+ "\n";
        }
        lyrics+= verse(endVerse);
        return lyrics;
    }

    String sing() {
        return verses(1,12);
     }

    /*public static void main(String[] args)
    {
        TwelveDays tw_song=new TwelveDays();
        String ans=tw_song.sing();
        System.out.println(ans);
    }*/

}
