package gottfried;

public enum Characters {

    //Princess characters (36 = 4*9)
    BeautifulPrincess("Beautiful_Princess.webp"),
    BeePrincess("Bee_Princess.webp"),
    BounceHousePrincess("Bounce_House_Princess.webp"),
    BreakfastPrincess("Breakfast_Princess.webp"),
    BubblegumPrincess("Bubblegum_Princess.webp"),
    ChewypastePrincess("Chewypaste_Princess.webp"),
    CookiePrincess("Cookie_Princess.webp"),
    CottonCandyPrincess("Cotton_Candy_Princess.webp"),
    CrabPrincess("Crab_Princess.webp"),
    DesertPrincess("Desert_Princess.webp"),
    ElbowPrincess("Elbow_Princess.webp"),
    EmbryoPrincess("Embryo_Princess.webp"),
    EmeraldPrincess("Emerald_Princess.webp"),
    EngagementRingPrincess("Engagement_Ring_Princess.webp"),
    FlamePrincess("Flame_Princess.webp"),
    FrozenYogurtPrincess("Frozen_Yogurt_Princess.webp"),
    GhostPrincess("Ghost_Princess.webp"),
    GridfacePrincess("Gridface_Princess.webp"),
    HotDogPrincess("Hot_Dog_Princess.webp"),
    JunglePrincess("Jungle_Princess.webp"),
    LizardPrincess("Lizard_Princess.webp"),
    LumpySpacePrincess("Lumpy_Space_Princess.webp"),
    MarcelineTheVampirePrincess("Marceline_The_Vampire_Princess.webp"),
    MonsterWifePrincess("Monster_Wife_Princess.webp"),
    MusclePrincess("Muscle_Princess.webp"),
    PeanutPrincess("Peanut_Princess.webp"),
    PurplePrincess("Purple_Princess.webp"),
    RaggedyPrincess("Raggedy_Princess.PNG.webp"),
    SkeletonPrincess("Skeleton_Princess.webp"),
    SlimePrincess("Slime_Princess.webp"),
    SpaceAngelPrincess("Space_Angel_Princess.webp"),
    StrudelPrincess("Strudel_Princess.webp"),
    TaoPrincess("Tao_Princess.webp"),
    TurtlePrincess("Turtle_Princess.webp"),
    WaterPrincess("Water_Princess.webp"),
    WildberryPrincess("Wildberry_Princess.webp"),

    //Main characters
    Finn("Finn.webp"),
    Jake("Jake.webp"),
    IceKing("Ice_King.webp"),
    Gunter("Gunter.webp"),
    Snail("Snail.gif"),

    ;

    private String fileName;

    Characters(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}
