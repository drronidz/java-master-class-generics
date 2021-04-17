public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham  = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team("Adelaide Crows");
        adelaideCrows.addPlayer(joe);

        //adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numberOfPlayers());

        Team<BaseballPlayer> chicagoCubs = new Team<>("Chicago Cubs");
        chicagoCubs.addPlayer(pat);

        System.out.println(chicagoCubs.numberOfPlayers());
        //Team<String> brokenTeam = new Team<String>("this won't work");
        //brokenTeam.addPlayer("no-one");

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle,1,0);
        hawthorn.matchResult(adelaideCrows,3,8);

        adelaideCrows.matchResult(fremantle,2,1);

    }
}
