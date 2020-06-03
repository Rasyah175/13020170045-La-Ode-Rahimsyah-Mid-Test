package com.laode.tugasproject4.repository;

import com.laode.tugasproject4.R;
import com.laode.tugasproject4.model.CastAndCrew;
import com.laode.tugasproject4.model.Movies;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {

    private static MovieRepository instance;
    private List<Movies> list = new ArrayList<>();

    public static MovieRepository getInstance(){
        if (instance == null){
            instance = new MovieRepository();
        }

        return instance;
    }

    public List<CastAndCrew> pacifictRim2013(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.charliehunnam, "Charlie Hunam"));
        al.add(new CastAndCrew(R.drawable.mako, "Rinko Kikuchi"));
        al.add(new CastAndCrew(R.drawable.idriselba, "Idris Elba"));
        al.add(new CastAndCrew(R.drawable.chalieday, "Charlie Day"));
        al.add(new CastAndCrew(R.drawable.burngorman, "Burn Gorman"));
        al.add(new CastAndCrew(R.drawable.robertkazinsky, "Robert Kazinsky"));
        al.add(new CastAndCrew(R.drawable.maxmartini, "Max Martini"));
        return al;
    }

    public List<CastAndCrew> wrathofthetitans(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.samworthington, "Sam Worthington"));
        al.add(new CastAndCrew(R.drawable.ralphfiennes, "Ralph Fiennes"));
        al.add(new CastAndCrew(R.drawable.liamnelson, "Liam Nelson"));
        al.add(new CastAndCrew(R.drawable.tobykebbel, "Toby Kebbel"));
        al.add(new CastAndCrew(R.drawable.lilijames, "Lili James"));
        al.add(new CastAndCrew(R.drawable.rosamundpike, "Rosamund Pike"));
        al.add(new CastAndCrew(R.drawable.edgarramirez, "Edgar Ramirez"));
        return al;
    }

    public List<CastAndCrew> pacifictRim2018(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.mako, "Rinko Kikuchi"));
        al.add(new CastAndCrew(R.drawable.johnboyega, "John Boyega"));
        al.add(new CastAndCrew(R.drawable.jingtian, "Jing Tian"));
        al.add(new CastAndCrew(R.drawable.scotteastwood, "Scottt Eastwood"));
        al.add(new CastAndCrew(R.drawable.chalieday, "Charlie Day"));
        al.add(new CastAndCrew(R.drawable.burngorman, "Burn Gorman"));
        return al;
    }

    public List<CastAndCrew> godzilla2014(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.elizabetholsen, "Elizabeth Olsen"));
        al.add(new CastAndCrew(R.drawable.aarontaylorjohnson, "Aaron Taylor Johnson"));
        al.add(new CastAndCrew(R.drawable.kenwatanabe, "Ken Watanabe"));
        al.add(new CastAndCrew(R.drawable.jaredkesso, "Jared Kesso"));
        al.add(new CastAndCrew(R.drawable.bryancranston, "Bryan Craston"));
        al.add(new CastAndCrew(R.drawable.carsonbolde, "Carson Bolde"));
        return al;
    }

    public List<CastAndCrew> godzilla2019(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.kenwatanabe, "Ken Watanabe"));
        al.add(new CastAndCrew(R.drawable.miliebobbybrown, "Ken Watanabe"));
        al.add(new CastAndCrew(R.drawable.verafarmiga, "Vera Farmiga"));
        al.add(new CastAndCrew(R.drawable.kylechandler, "Kyle Chander"));
        al.add(new CastAndCrew(R.drawable.aishahinds, "Aisha Hinds"));
        al.add(new CastAndCrew(R.drawable.jaredkesso, "Jared Kesso"));
        al.add(new CastAndCrew(R.drawable.carsonbolde, "Carson Bolde"));
        return al;
    }

    public List<CastAndCrew> jurasicworld2015(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.brycedallashoward, "Bryce Dallas Howard"));
        al.add(new CastAndCrew(R.drawable.chrispratt, "Chris Pratt"));
        al.add(new CastAndCrew(R.drawable.irrfankhan, "Irrfan Khan"));
        al.add(new CastAndCrew(R.drawable.laurenlapkus, "Lauren Lapkus"));
        al.add(new CastAndCrew(R.drawable.nickrobinson, "Nick Robinson"));
        return al;
    }

    public List<CastAndCrew> jurasicworld2019(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.brycedallashoward, "Bryce Dallas Howard"));
        al.add(new CastAndCrew(R.drawable.chrispratt, "Chris Pratt"));
        al.add(new CastAndCrew(R.drawable.verafarmiga, "Vera Farmiga"));
        al.add(new CastAndCrew(R.drawable.katiemcgrath, "Katie Mcgrath"));
        al.add(new CastAndCrew(R.drawable.vincentdonofrio, "Vincen D'Onofrio"));
        return al;
    }

    public List<CastAndCrew> realstel(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.hughjackman, "Hugh Jackman"));
        al.add(new CastAndCrew(R.drawable.evangelinelilly, "Evange Line Lilly"));
        al.add(new CastAndCrew(R.drawable.dakotagoyo, "Dakota Goyo"));
        al.add(new CastAndCrew(R.drawable.olgafonda, "Olga Fonda"));
        al.add(new CastAndCrew(R.drawable.kevindurand, "Kevin Durand"));

        return al;
    }

    public List<CastAndCrew> malifincent2019(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.angelinajolie, "Angelina Jolie"));
        al.add(new CastAndCrew(R.drawable.ellefanning, "Elle Fanning"));
        al.add(new CastAndCrew(R.drawable.brentonthwaites, "Brenton Thwaites"));
        al.add(new CastAndCrew(R.drawable.samriley, "Sam Riley"));
        al.add(new CastAndCrew(R.drawable.ellapurnell, "Ella Purnell"));
        return al;
    }

    public List<CastAndCrew> clashofthetitans(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.samworthington, "Sam Worthington"));
        al.add(new CastAndCrew(R.drawable.gemmaarterton, "Gemma Arterton"));
        al.add(new CastAndCrew(R.drawable.alexadavalos, "Alexa Davalos"));
        al.add(new CastAndCrew(R.drawable.kayascodelario, "Kaya Scodelario"));
        al.add(new CastAndCrew(R.drawable.ralphfiennes, "Ralph Fiennes"));
        al.add(new CastAndCrew(R.drawable.madsmikkelsen, "Mad Mikkelsen"));
        al.add(new CastAndCrew(R.drawable.liamnelson, "Liam Nelson"));
        return al;
    }

    public List<CastAndCrew> whoami2014(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.tomschiling, "Tom Schiling"));
        al.add(new CastAndCrew(R.drawable.hannahherzsprung, "Hanna Herzsprung"));
        al.add(new CastAndCrew(R.drawable.elyasmbarek, "Elyas M'barek"));
        al.add(new CastAndCrew(R.drawable.trinedyrholm, "Trine Dyrholm"));
        al.add(new CastAndCrew(R.drawable.antoniemonotjr, "Antonie Monot, jr"));
        al.add(new CastAndCrew(R.drawable.wotanwilkie, "Wotan Wilkie"));
        return al;
    }

    public List<CastAndCrew> kinkong(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.naomiwatts, "Naomi Watts"));
        al.add(new CastAndCrew(R.drawable.adrienbrody, "Adrien Brody"));
        al.add(new CastAndCrew(R.drawable.andyserkis, "Andy Serkis"));
        al.add(new CastAndCrew(R.drawable.colinhanks, "Colin hanks"));
        al.add(new CastAndCrew(R.drawable.jackblack, "Jack Black"));
        al.add(new CastAndCrew(R.drawable.jamiebell, "Jamie Bell"));
        return al;
    }

    public List<CastAndCrew> kongskul(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.brielarson, "Brie Larson"));
        al.add(new CastAndCrew(R.drawable.johngoodman, "John Goodman"));
        al.add(new CastAndCrew(R.drawable.roberttaylor, "Robert Taylor"));
        al.add(new CastAndCrew(R.drawable.samuelljackson, "Samuel L. Jackson"));
        al.add(new CastAndCrew(R.drawable.tobykebbel, "Toby Kebbell"));
        al.add(new CastAndCrew(R.drawable.jingtian, "Jing Tian"));
        al.add(new CastAndCrew(R.drawable.thomasmann, "Thomas Mann"));
        al.add(new CastAndCrew(R.drawable.tomhiddleston, "Tom Hiddles Ton"));
        return al;
    }

    public List<CastAndCrew> rampage(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.dwaynejohnson, "Dwayne Johnson"));
        al.add(new CastAndCrew(R.drawable.naomieharris, "Naomie Harris"));
        al.add(new CastAndCrew(R.drawable.jakelacy, "Jake Lacy"));
        al.add(new CastAndCrew(R.drawable.jeffreydeanmorgan, "jeffrey Dean Morgan"));
        al.add(new CastAndCrew(R.drawable.joemanganiello, "Joe Manganiello"));
        al.add(new CastAndCrew(R.drawable.breannehill, "Breane Hill"));
        al.add(new CastAndCrew(R.drawable.malinakerman, "Malina Kerman"));
        return al;
    }

    public List<CastAndCrew> themeg(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.jasonstatham, "Jason Statham"));
        al.add(new CastAndCrew(R.drawable.cliffcurtis, "Cliff Curtis"));
        al.add(new CastAndCrew(R.drawable.jessicamcnamee, "Jessica McNamme"));
        al.add(new CastAndCrew(R.drawable.libingbing, "Li Bing Bing"));
        al.add(new CastAndCrew(R.drawable.pagekennedy, "Page Kennedy"));
        al.add(new CastAndCrew(R.drawable.rainnwilson, "Rain Wilson"));
        al.add(new CastAndCrew(R.drawable.rubyrose, "Ruby Rose"));
        al.add(new CastAndCrew(R.drawable.shuyasophiacai, "Shuya Sophiacai"));
        al.add(new CastAndCrew(R.drawable.winstonchao, "Winston Chao"));
        return al;
    }

    public List<CastAndCrew> venom(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.tomhardy, "Tom Hardy"));
        al.add(new CastAndCrew(R.drawable.michellewilliams, "Michelle Williams"));
        al.add(new CastAndCrew(R.drawable.marcellabragio, "Marcella Bragio"));
        al.add(new CastAndCrew(R.drawable.rizahmed, "Riz Ahmed"));
        al.add(new CastAndCrew(R.drawable.jennyslate, "Jenny Slate"));
        return al;
    }

    public List<CastAndCrew> thepredator(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.jacobtremblay, "Jacob Tremblay"));
        al.add(new CastAndCrew(R.drawable.boydholbrook, "Boy Dhol Brook"));
        al.add(new CastAndCrew(R.drawable.oliviamunn, "Olivia Munn"));
        al.add(new CastAndCrew(R.drawable.strlingkbrown, "Sterling K. Brown"));
        al.add(new CastAndCrew(R.drawable.thomasjane, "Thomas Jane"));
        al.add(new CastAndCrew(R.drawable.trevanterhodes, "Trevan Terhodes"));
        return al;
    }

    public List<CastAndCrew> ragnarok(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.nicolaiclevebroch, "Nicolai Cleve Broch"));
        al.add(new CastAndCrew(R.drawable.stefancronwall, "Stefan Cronwall"));
        al.add(new CastAndCrew(R.drawable.sofiahelin, "Sofia Helin"));
        al.add(new CastAndCrew(R.drawable.verarudi, "Vera Rudi"));
        return al;
    }

    public List<CastAndCrew> jumanjisatu(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.dwaynejohnson, "Dwayne Johnson"));
        al.add(new CastAndCrew(R.drawable.alexwolff, "Alex Wolff"));
        al.add(new CastAndCrew(R.drawable.colinhanks, "Colin Hanks"));
        al.add(new CastAndCrew(R.drawable.morganturner, "Morgan Turner"));
        al.add(new CastAndCrew(R.drawable.karengillan, "Karen Gillan"));
        al.add(new CastAndCrew(R.drawable.kevinhart, "Kevin Hart"));
        al.add(new CastAndCrew(R.drawable.nickjonas, "Nick Jonas"));
        al.add(new CastAndCrew(R.drawable.serdariusblain, "SerDarius Blain"));
        al.add(new CastAndCrew(R.drawable.rhysdarby, "Rhys Darby"));
        return al;
    }

    public List<CastAndCrew> jumanjidua(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.dwaynejohnson, "Dwayne Johnson"));
        al.add(new CastAndCrew(R.drawable.alexwolff, "Alex Wolff"));
        al.add(new CastAndCrew(R.drawable.colinhanks, "Colin Hanks"));
        al.add(new CastAndCrew(R.drawable.morganturner, "Morgan Turner"));
        al.add(new CastAndCrew(R.drawable.karengillan, "Karen Gillan"));
        al.add(new CastAndCrew(R.drawable.kevinhart, "Kevin Hart"));
        al.add(new CastAndCrew(R.drawable.nickjonas, "Nick Jonas"));
        al.add(new CastAndCrew(R.drawable.serdariusblain, "SerDarius Blain"));
        al.add(new CastAndCrew(R.drawable.rhysdarby, "Rhys Darby"));
        al.add(new CastAndCrew(R.drawable.dannydavito, "Danny DaVito"));
        al.add(new CastAndCrew(R.drawable.dannyglover, "Danny Glover"));
        al.add(new CastAndCrew(R.drawable.awkwafina, "Awkwafina"));
        return al;
    }

    public void init(){
        list.clear();
        list.add(new Movies(R.drawable.paci13,"Pacifict Rim (2013)","Pacific Rim is a 2013 American science-fiction monster film directed by Guillermo del Toro, starring Charlie Hunnam, Idris Elba, Rinko Kikuchi, Charlie Day, Robert Kazinsky, Max Martini and Ron Perlman, and the first film in the Pacific Rim franchise. The screenplay was written by Travis Beacham and del Toro from a story by Beacham. The film is set in the future, when Earth is at war with the Kaiju,[a] colossal sea monsters which have emerged from an interdimensional portal on the bottom of the Pacific Ocean. To combat the monsters, humanity unites to create the Jaegers,"," Action, Adventure, Sci-Fi","2h 11m","Guillermo del Toro","2013", pacifictRim2013()));
        list.add(new Movies(R.drawable.paci,"Pacific Rim: Uprising (2018)","Jake Pentecost, son of Stacker Pentecost, reunites with Mako Mori to lead a new generation of Jaeger pilots, including rival Lambert and 15-year-old hacker Amara, against a new Kaiju threat.","Action, Adventure, Sci-Fi","1h 51m","Steven S. DeKnight","2018", pacifictRim2018()));
        list.add(new Movies(R.drawable.god2014,"GodZilla (2014)","The world is beset by the appearance of monstrous creatures, but one of them may be the only one who can save humanity."," Action, Adventure, Sci-Fi","2h 3m"," Gareth Edwards","2014", godzilla2014()));
        list.add(new Movies(R.drawable.god2019,"GodZilla (2019)","The crypto-zoological agency Monarch faces off against a battery of god-sized monsters, including the mighty Godzilla, who collides with Mothra, Rodan, and his ultimate nemesis, the three-headed King Ghidorah.","Action, Adventure, Sci-Fi","2h 12m","Michael Dougherty","2019", godzilla2019()));
        list.add(new Movies(R.drawable.jur2015,"Jurasic World (2015)","A new theme park, built on the original site of Jurassic Park, creates a genetically modified hybrid dinosaur, the Indominus Rex, which escapes containment and goes on a killing spree","Action, Adventure, Sci-Fi","2h 4m","Colin Trevorrow","2015", jurasicworld2015()));
        list.add(new Movies(R.drawable.jur2018,"Jurasic World (2018)","When the island's dormant volcano begins roaring to life, Owen and Claire mount a campaign to rescue the remaining dinosaurs from this extinction-level event.","Action, Adventure, Sci-Fi","2h 8m","J. A. Bayonna","2018", jurasicworld2019()));
        list.add(new Movies(R.drawable.realsteel,"Real Steel (2011)","In the near future, robot boxing is a top sport. A struggling ex-boxer feels he's found a champion in a discarded robot."," Action, Drama, Family ","2h 7m"," Shawn Levy","2011", realstel()));
        list.add(new Movies(R.drawable.malifincent,"Malifincent (2019)","Maleficent and her goddaughter Aurora begin to question the complex family ties that bind them as they are pulled in different directions by impending nuptials, unexpected allies and dark new forces at play.","Family,Fantasy, Adventure","1h 59m","Joachim Ronning","2019", malifincent2019()));
        list.add(new Movies(R.drawable.whoami,"Who Am I (2014)","Benjamin, a young German computer whiz, is invited to join a subversive hacker group that wants to be noticed on the world's stage."," Crime, Drama, Mystery ","1h 42m","Baran bo Odar","2014", whoami2014()));
        list.add(new Movies(R.drawable.classofthetitans,"Clash Of The Titans (2010)","Perseus demigod, son of Zeus, battles the minions of the underworld to stop them from conquering heaven and earth.","Action, Adventure, Fantasy","1h 46m","Louis Leterrier","2010", clashofthetitans()));
        list.add(new Movies(R.drawable.wrathtitans,"Wrath Of The Titans (2012)","Perseus braves the treacherous underworld to rescue his father, Zeus, captured by his son, Ares, and brother Hades who unleash the ancient Titans upon the world","Action, Adventure, Fantasy ","1h 39m","Jonathan Liebesman","2012", wrathofthetitans()));
        list.add(new Movies(R.drawable.kingkong,"King Kong (2005)","A greedy film producer assembles a team of moviemakers and sets out for the infamous Skull Island, where they find more than just cannibalistic natives.","Action, Adventure, Drama","3h 7m","Peter Jackson","2005", kinkong()));
        list.add(new Movies(R.drawable.kongskullisland,"Kong Skul Island (2017)","After the Vietnam war, a team of scientists explores an uncharted island in the Pacific, venturing into the domain of the mighty Kong, and must fight to escape a primal Eden.","Action, Adventure, Fantasy ","1h 58m"," Jordan Vogt-Roberts","2017",kongskul()));
        list.add(new Movies(R.drawable.rampage,"Rampage (2018)","When three different animals become infected with a dangerous pathogen, a primatologist and a geneticist team up to stop them from destroying Chicago.","Action, Adventure, Sci-Fi ","1h 47m","Brad Peyton","2018", rampage()));
        list.add(new Movies(R.drawable.themeg,"The Meg (2018)","A group of scientists exploring the Marianas Trench encounter the largest marine predator that has ever existed - the Megalodon.","Action, Horror, Sci-Fi ","1h 53m","Jon Turteltaub","2018", themeg()));
        list.add(new Movies(R.drawable.venom,"Venom (2018)","A failed reporter is bonded to an alien entity, one of many symbiotes who have invaded Earth. But the being takes a liking to Earth and decides to protect it"," Action, Adventure, Sci-Fi ","1h 52m","Ruben Fleischer","2018", venom()));
        list.add(new Movies(R.drawable.thepredator,"The Predator (2018)","When a young boy accidentally triggers the universe's most lethal hunters' return to Earth, only a ragtag crew of ex-soldiers and a disgruntled scientist can prevent the end of the human race.","Action, Adventure, Sci-Fi","1h 47m","Shane Black","2018", thepredator()));
        list.add(new Movies(R.drawable.ragnarok,"Ragnarok (2013)","Norwegian archaeologist Sigurd Svendsen forms a small team and sets off to find the true meaning of the secret runes found carved in rock and accidentally awakens a giant monster.","Adventure, Fantasy","1h 40m","Mikkel Braenne Sandemose","2013", ragnarok()));
        list.add(new Movies(R.drawable.jumanjisatu,"Jumanji: Welcome to the Jungle (2017)","Four teenagers are sucked into a magical video game, and the only way they can escape is to work together to finish the game.","Action, Adventure, Comedy ","1h 59m"," Jake Kasdan","2017", jumanjisatu()));
        list.add(new Movies(R.drawable.jumanjidua,"Jumanji: The Next Level (2019)","In Jumanji: The Next Level, the gang is back but the game has changed. As they return to rescue one of their own, the players will have to brave parts unknown from arid deserts to snowy mountains, to escape the world's most dangerous game","Action, Adventure, Comedy","2h 3m","Jake Kasdan","2019", jumanjidua()));
    }

    public List<Movies> getData(){
        return list;
    }

    public void removeIndex(int index){
        getData().remove(index);
    }

    public void clearData(){
        list.clear();
    }
}
