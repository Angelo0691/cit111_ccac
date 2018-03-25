/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;
import java.util.Scanner;
import java.util.Random;


/**
 * This is a throwback to the final obstacle in the Eliminator from the 
 * TV Show American Gladiators.
 * @author angal
 */
public class AmericanGladiatorEliminator {
    public static void main(String[] args) {
        int corridor, selector;
        double bodyWeight;
        String intro;
        intro = "            WELCOME TO THE FINAL OBSTACLE IN THE ELIMINATOR";
        System.out.println(intro);
        System.out.println("\t    Behind each door is a possible unknown obstacle!");
        System.out.println();
        System.out.println("   1           2          3   ");
        System.out.println("********   ********   ********");
        System.out.println("*      *   *      *   *      *");
        System.out.println("*      *   *      *   *      *");
        System.out.println("*O     *   *O     *   *O     *");
        System.out.println("*      *   *      *   *      *");
        System.out.println("*      *   *      *   *      *");
        System.out.println("*      *   *      *   *      *");
        System.out.println("********   ********   ********");
        System.out.println();
        System.out.println("********************************************"
                + "************************************");
        System.out.println();
        System.out.println("BEFORE YOU SELECT WHICH DOOR,"
                + " YOU MUST FIRST ENTER YOUR BODY WEIGHT: ");
        //create Scanner object to gather users body weight which will be used
        //to calculate how far Hulk throws the user should he/she be so unfortunate
        Scanner userInput = new Scanner(System.in);
        bodyWeight = userInput.nextDouble();
        System.out.println();
        System.out.println("THANK YOU FOR ENTERING YOUR BODY WEIGHT!  NOW....");
        
        System.out.println();
        System.out.println("     CHOOSE AT YOUR OWN RISK!!!   ");
        
        /**
         * The variable corridor stores the value for which door the user selects 
         * to pass through. This value will only be used via if statement to decide 
         * whether the user chooses a valid door option or not.  
         * 
         * If the user chooses a number other than 1,2 or 3
         * the program will label them a CHEATER and boot them from the game.
         * 
         * If they DO choose 1,2 or 3, I want the outcome to change each time
         * the program is executed.  Otherwise, the user could easily "game the 
         * system" and figure out what each door holds after three iterations 
         * and that would just be boring. 
         */
        corridor = userInput.nextInt();
        if (corridor >= 1 && corridor <= 3){
                     
        /**
         * create a Random number generator that generates a random integer
         * between 1 (inclusive) and 4 (exclusive) to populate the REAL selector
         * value
         */
        Random r = new Random();
        selector = r.nextInt(3) + 1;
        /**
         * Switch statement to call one of the 3 methods
         */
        switch(selector){
            case 1:
            //call hulkSmash method
            hulkSmash(bodyWeight);
            break;
            
            case 2:
            //call erwinsKitty method
            erwinsKitty(selector);
            break;
            
            case 3:
            //call freePass method
            freePass();
            break;
            
            default:
            System.out.println("This should never be reached"); 
            
        }//close switch
        
        System.out.println();
        System.out.println("Thank you for competing in the "
                + "80's hit TV show, American Gladiator!!");
        }//close if
        else{
        System.out.println("CHEATER!!  You have been DISQUALIFIED!!");
        System.out.println("The 80's hit TV show, American Gladiator does NOT"
                + " condone cheating and no longer welcomes your presence!!");
            
        }//close else
        
    }//close main method
    
    //the hulkSmash method decides how many times Hulk smashes you and how far he 
    //subsequently throws you.
    public static void hulkSmash(double weight) {
    System.out.println();
    System.out.println("*******************************************************************************");
    System.out.println("HULK SMAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAASH!"); 
    System.out.println("YIKES...now you're faced with Lou Ferrigno as the"
            + " Incredible Hulk (circa 1970)!!"); 
    System.out.println();
    
    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&%#((//*/#&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&((/((#%%&@&%%#(//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&%&@%&@&@&@&&&%*,#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#@@@@@@@@@@@@&@%&%**,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@@@@@@@@@#&&@@@@@@&%&&%%&%&% ,, %@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@@@@@@@@%&@@@&@@@%%(((####(%#%,./@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@@@@@@@@#@@&@&&&%(/*/((/*(%,/#/ .@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@@@@@@@@&&&@@@@@&@%((/##/#*/* (@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&@&@@@@&@/,****//* ,@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&%@&%&@&&(* .*,  %* ,@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&@%%@#/(***,  ,. &@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%#@&%%%&((/#/*  /#%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@@@@@@(#%%&@@&&&&&###( ,  /(((((*%@@@@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@@@@%@@@@@@@@%&&@%(#(/*** ..////((((,(@@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@#/%&@@@@@@@@&&&@@&@%((*//////////(// *@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@(@@@&&&@@@@@@@@@&&&&@@%#((((//////(((((/ *#*&@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@&%&%&@@@@@@%##(&@@@&&%#%%##((((///((((((((((###.&@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@#%%&&&@@&(#((((&%#(((##%(#%#/(////////#(((((((##(./@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@%%&%###@%##((//####(((/**//(#(((////*//#((((((#(##(.,@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@&%&%%%%&%#########(((((//*/(##((////////(((((((####(, &@@@@@@@@@@@@\n" +
"@@@@@@@@@@&(%%&&&%%%%########(((((((///#%##(((//////((((((((#((#/ ,@@@@@@@@@@@@\n" +
"@@@@@@@@@#@&%&@@&&&&%&%%######(((((((((%%%###(((((((((((##(#(##((/ @@@@@@@@@@@@\n" +
"@@@@@@@@%%%%&@@@@@@@@&&&%%%%###((((////%%%#####((################(  &@@@@@@@@@@\n" +
"@@@@@@@%&%%%%####&@@@@%@@@&%%###(((((//&&%#####(((####%%@&%%%%#####( %@@@@@@@@@\n" +
"@@@@@@%%&&%%####((((%@@&&@@%%#####(((((&%#############./@&%%#######(( #@@@@@@@@\n" +
"@@@@@&&&&&%%######(*@@@@%&@@&%%#####((%@@%%%########( (@@@%%%%#####(.* @@@@@@@@\n" +
"@@@#%%%#%@%%%####/#@@@@@@%&&@@&%%%####@@@@@&&%%%%%,#  @@@@&%%%%####(./.@@@@@@@@\n" +
"@&%%%####%@@%%#/@@@@@@@@@&&&&@@@@@@%%#(#%#%&&%###(/..(@@@@@&%%#%####(  (@@@@@@@\n" +
"@&%%###((###%@@@@@@@@@@@@%&&@@&&@@&%%##%@&%#######,/*/@@@@&@&&%%%%%##*  @@@@@@@\n" +
"@%#%%##((,/#@@@@@@@@@@@@&&&&@@@@@@@@&%%%@&%%###/%&@&. @@@@@@@&%%@&@%#**..@@@@@@\n" +
"%%%##((/*%@@@@@@@@@@@@@&&@%%@&%%&%%#%%&&%%%####%@&//@@@@@@@@&@@@%##*,, .@@@@@\n" +
"%#%#%##((,,&@@@@@@@@@@@@&&@@%@@@@@@%%%#%%%%%##%%%%@(.(#@@@@@@@@@&%##,.( .@@@@@@\n" +
"&%(#(#(((/*@@@@@@@@@@@@/#%@@&&&&@@&%%%%%%&@#%%%%%%((/,#@@@@@@@@&&%####(  &@@@@@\n" +
"@&%%#((((*@@@@@@@@@@@@&&@@@@@@@@&%&@%%%%%&%%%%*/&%%%/..&@@@@@@&@%%####,( @@@@@@\n" +
"@@&&%((#%%%#(@@@@@@@@@%%%&&&&%&@@@@&%&&&&@&&&&&@@&%@@, %@@@%/(&@%%# *,/ &@@@@@@\n" +
"@@@&%%(##((#*&@@@@@@@@&&&&&&&%%%&@@@&&@@@@&&&&&&&&%@@**.@##(##(.##/*##/(@@@@@@@\n" +
"@@@@&%#%%%%#/@@@@@@@@&@&@@@&%&&&&%@%%&&&&&&&@&&&&&&@&,.*@%%####/ .###(@@@@@@@@@\n" +
"@@@@@%%%%%#/@@@@@@@&&&@%&&&@@@@@&&%%&%&&@@&&&&&&&@#*,.%#%&%&@%.,(#@@@@@@@@@@@\n" +
"@@@@@@@%%#%%##@@@@@@&&&&&&&&&&&&&&&@&&&&@@@@@@@@&&@@(..@@@@@@&%(##@@@@@@@@@@@@@\n" +
"@@@@@@@@@@%%@@@@@@@@%&&@&&&@@@@@@&@@@@&@@@@@@@@@@@#(#*%%%@@@%%%@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@&&@@&&&&@@@@&@@@&&@@@@@@@&@@@@@@@/..,@@%&@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@&&@@&&&&&&@@&@@@@@@@@@@@@@@@@@@@@&*. @@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@&@@@@@&@@@@@@@@@@@@@@@@@@@@@@@@@@%*..@@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&%(,.@@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@&@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&&&&*.@@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@&@@@@@@@@@@@@@@@@@&@@@@@@@@&&&&&&&&(*.@@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%&@@@&@@@&&&&&&&&*/@@@@@@@@@@@@@@@@@@@@@@");
    
    //Generate random int for number of smashes
    Random r = new Random();
    //limit random integer from 1 to 5000 
    int smashes = r.nextInt(5000)+1;
    double milesThrown;
    
    System.out.println();
    System.out.println("The Incredible Hulk is none"
            + " too pleased with your attempt at passage!!  \nHulk smashes you " 
            + smashes + " times!"); 
    //generates a random distance that the Hulk throws the user based on the
    //users body weight and the number of times the Hulk smashes them
    double distance = smashes * weight;
    System.out.println("The Incredible Hulk now takes your unconscious body and"
            + " throws you " + distance + " feet!");
    milesThrown = distance / 5280;
    
    System.out.println("You land " + milesThrown + " miles outside of the arena!");
    System.out.println("Sorry, you did not complete the final Eliminator challenge.");
    
        }//close hulkSmash
    
    //erwinsKitty method has two possible outcomes (maybe it should have 3 but I don't 
    //know how to model my code to represent the paradox of a cat being both
    //alive and dead at the same time)
    public static void erwinsKitty(int kittyFate){
        System.out.println();
        System.out.println("What is this?!  IT'S SCHRÖDINGERS CAT! But... ");
        if (kittyFate == 1 || kittyFate == 3){
            System.out.println("                                                                             \n" +
"   #*                                                                       .  \n" +
"   %@                                                                     (%&. \n" +
"   (//%.                 %/      .,                                    *&* .&  \n" +
" (@&&(/,,%%*.              &@#.  &@.                               .*  ///&  \n" +
"   %. #  ,(/,.,(%%(.        .# %##*(@@#(/**..               .(%%(.  ,/ * %#  \n" +
"   .% .*       ,/#(. *#%*.#(*(#  (@         ..,(#&@#,    /%%(.   .*(*    , @*  \n" +
"    .( #.            ,(* ,%%                  .,/(*  ,/%,  *((*         , .&.  \n" +
"     ((.#               .#                       .     .(               * *#   \n" +
"      (..*             #.                                (,            ,, %*   \n" +
"       %*,(           #                                   *.           / *@    \n" +
"        /* #.        #.                                    #.          , &%    \n" +
"         ,& ./       /                                     .#         / *&.    \n" +
"           ## ,/    *       .*/#/                 /#(,.     ,.       /,*@.     \n" +
"             #% ,(. #                                        #.     * ,@*      \n" +
"               *%, ,.                                         #   ./ &@        \n" +
"                  */       ..                          ..      ##, &@,         \n" +
"                 ,%         /@#  (@.            ,&*  %@*        #@&.           \n" +
"                .%            ,@@.                *@@.           %*            \n" +
"               (#           /&*  *&,            /%,  /@,          ,#           \n" +
"             *%                                                     *%,        \n" +
"          ,%(                            ,,.                           /@#     \n" +
"       &(                              @@@@@@/                     /%          \n" +
"         ,#%(,.    .,/((######(*.       (@@&/       .,*(##%###(/*,.  .#%/      \n" +
"           ,##,                          .#                      (&%*...,.     \n" +
"           .,#@&(         .*(#%#/,,.      (       .,*(###/,    /#%%%%&*        \n" +
"                ,%#.,//,          .       *       .          .#&%*.            \n" +
"               .,. .#*       ,#(,      .,***         *#/    #*      ,.         \n" +
"                      *(   #,        //      (*          (%*                   \n" +
"                        *&,          #.       #        .#* ./                  \n" +
"                       ,   #%         .#(((#/.       /&.     .*                \n" +
"                              *.          .%   *%#,          .               \n" +
"                                   *(%%%%%%%%#/.                         ");
            System.out.println("OH NOOO!! the poor kitty is DEAD!!!");
            System.out.println();
            System.out.println("As you are overcome with both sadness for the"
                    + " poor kitty and disbelief that you \nhave just solved a paradox"
                    + " dating back to the early 20th century, \nyour competitor"
                    + " has crossed the finish line ahead of you!!");
            System.out.println("Try again next time!");
            
        }//close if
        else {
           System.out.println();
           System.out.println("                       ...........                .\"\"\".             .\"\"\".\n" +
"            ...\"\"\"\"\"             \"\"\"\"\"...       $   . \".         .\" .   $\n" +
"        ..\"\"        .   .   .   .   .    ..    $   $$$. \". ... .\" .$$$   $\n" +
"      .\"    . \" . \" . \" . \" . \" . \" . \" .  \"\" .\"  $$$\"\"\"  \"   \"  \"\"\"$$$  \".\n" +
"    .\"      . \" . \" . \" . \" . \" . \" . \" .     $  \"                    \"   $\n" +
"   .\"   . \" . \" . \"           \"   \" . \" . \"  .\"      ...          ...     \".\n" +
"  .\"    . \" . \"    ..\"\"\"\"\"\"\"\"\"...     \" . \"  $     .$\"              \"$.    $\n" +
" .\"     . \" . \" .\"\"     .   .    \"\"..   . \" $ \".      .\"\"$     .\"\"$      .\" $\n" +
".\"    \" . \" .       . \" . \" . \" .    $    \" $ \"      \"  $$    \"  $$       \" $\n" +
"$     \" . \" . \" . \" . \" . \" . \" . \"   $     $             $$.$$             $\n" +
"$     \" . \" . \" . \" . \" . \" . \" . \" .  $  \" $  \" .        $$$$$        . \"  $\n" +
"$     \" . \" . \" . \" . \" . \" . \" . \" .  $    $      \"  ..   \"$\"   ..  \"      $\n" +
"\".    \" . \" . \" . \" . \" . \" . \" . \"   .\"  \"  $  . . . $  . .\". .  $ . . .  $\n" +
" $    \" . \" . \" . \" . \" . \" . \" . \"  .\"   \"            \"..\"   \"..\"\n" +
"  $     . \" . \" . \" . \" . \" . \"   ..\"   . \" . \"..    \"             \"    ..\"\n" +
"  \".      \" . \" . \" . \" . \" .  .\"\"    \" . \" .    \"\"\"$...         ...$\"\"\"\n" +
"   \". \"..     \" . \" . \" . \" .  \"........  \"    .....  .\"\"\".....\"\"\"\n" +
"     \". .\"$\".....                       $...\"$\"$\".\"   $\".$\"... `\":....\n" +
"       \"\"..\"    $\"$\"$\"$\"\"\"$........$\"$\"$\"  .\".\".\"  ...\"\"      .\"\".    `\"\".\n" +
"           \"\"\".$.$.\" .\"  .\".\".\"    .\".\".\" $.$.$\"\"\"\".......  \". \". $ \". \". $\n" +
"                  \"\"\".$.$.$.$.....$.$.\"\"\"\"               \"\"..$..$.\"..$..$.\"");
           
           System.out.println();
           System.out.println("You can't believe it!  The kitty is ALIVE!!");
           System.out.println();
           System.out.println("As you are awestruck from the realization that you"
                    + " have just solved \na paradox dating back to the early 20th"
                    + " century, your competitor \nhas crossed the finish line"
                    + " ahead of you!!");
           System.out.println();
           System.out.println("Hey, at least you have a cute little"
                   + " (possibly immortal) cat!");
           System.out.println("Better luck next time!");
        }//close else
    }//close erwinsKitty
    
    //freePass method means there is no obstacle...the user wins the event!
    public static void freePass(){
            System.out.println();
            System.out.println("*******************************************************************************");
            System.out.println("WOW!  You really lucked out!\nThere is no one "
                    + "on the other side of this door and you cross the finish line"
                    + " first, uncontested!!\nCONGRATULATIONS!! You have won the"
                    + " Eliminator!!");
            System.out.println("*******************************************************************************");
        
    }//close freePass
    
}//close class
