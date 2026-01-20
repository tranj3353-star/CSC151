import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class App {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(App::createUI);
    }

    private static void createUI() {
        JFrame frame = new JFrame("Baltimore Ravens – Roster & Staff");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 800);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(new Color(79,10,109));

        Dimension pref = mainPanel.getPreferredSize();
        mainPanel.setMaximumSize(new Dimension(pref.width, pref.height));

        mainPanel.add(sectionLabel("The Raven's Roster", new Color(189,181,8)));

        // === PLAYERS ROSTER ===
        mainPanel.add(sectionLabel("Player Roster", new Color(189,181,8)));

        // ---- Quarterbacks ----
        mainPanel.add(createExpandable(
                "Lamar Jackson – QB",
                "Stats:\n"
            + "• NFL MVP: 2019, 2023\n"
            + "• Career Passing Yards: 17,000+\n"
            + "• Career Rushing Yards: 5,000+\n\n"
            + "Description:\n"
            + "Elite dual-threat quarterback and centerpiece of the Ravens offense."
        ));

        mainPanel.add(createExpandable(
                "Cooper Rush – QB",
                "Stats:\n"
            + "• NFL Starts: 10+\n\n"
            + "Description:\n"
            + "Veteran backup quarterback providing experience and stability."
        ));

        // ---- Running Backs / Fullback ----
        mainPanel.add(createExpandable(
                "Derrick Henry – RB",
                "Stats:\n"
            + "• Career Rushing Yards: 9,000+\n"
            + "• Career Rushing TDs: 90+\n\n"
            + "Description:\n"
            + "Power back known for size, speed, and late-game dominance."
        ));

        mainPanel.add(createExpandable(
                "Justice Hill – RB",
                "Stats:\n"
            + "• Versatile runner and receiver\n\n"
            + "Description:\n"
            + "Change-of-pace back with strong special teams value."
        ));

        mainPanel.add(createExpandable(
                "Keaton Mitchell – RB",
                "Stats:\n"
            + "• Yards per carry: 8.0+ (rookie season)\n\n"
            + "Description:\n"
            + "Explosive speed back capable of breaking big plays."
        ));

        mainPanel.add(createExpandable(
                "Rasheen Ali – RB",
                "Stats:\n"
            + "• College standout at Marshall\n\n"
            + "Description:\n"
            + "Young developmental back with quickness and vision."
        ));

        mainPanel.add(createExpandable(
                "Patrick Ricard – FB",
                "Stats:\n"
            + "• Pro Bowls: Multiple\n\n"
            + "Description:\n"
            + "Versatile fullback and blocking specialist, key to run-heavy sets."
        ));

        // ---- Tight Ends ----
        mainPanel.add(createExpandable(
                "Mark Andrews – TE",
                "Stats:\n"
            + "• Pro Bowls: Multiple\n"
            + "• Career Receptions: 400+\n\n"
            + "Description:\n"
            + "Primary receiving tight end and red-zone threat."
        ));

        mainPanel.add(createExpandable(
                "Isaiah Likely – TE",
                "Stats:\n"
            + "• Breakout games when starting\n\n"
            + "Description:\n"
            + "Athletic tight end with strong receiving upside."
        ));

        mainPanel.add(createExpandable(
                "Charlie Kolar – TE",
                "Stats:\n"
            + "• Strong blocking metrics\n\n"
            + "Description:\n"
            + "Reliable tight end contributing in both run and pass schemes."
        ));

        // ---- Offensive Line ----
        mainPanel.add(createExpandable(
                "Ronnie Stanley – OT",
                "Stats:\n"
            + "• Pro Bowl LT\n\n"
            + "Description:\n"
            + "Veteran left tackle protecting the blind side."
        ));

        mainPanel.add(createExpandable(
                "Tyler Linderbaum – C",
                "Stats:\n"
            + "• Pro Bowl Center\n\n"
            + "Description:\n"
            + "Elite technician anchoring the offensive line."
        ));

        mainPanel.add(createExpandable(
                "Andrew Voorhees – G",
                "Stats:\n"
            + "• Rookie season contributor\n\n"
            + "Description:\n"
            + "Physical interior lineman with strong run-blocking ability."
        ));

        mainPanel.add(createExpandable(
                "Ben Cleveland – G",
                "Stats:\n"
            + "• Known for size and power\n\n"
            + "Description:\n"
            + "Depth guard providing physicality in the trenches."
        ));

        mainPanel.add(createExpandable(
                "Corey Bullock – OT",
                "Stats:\n"
            + "• Developmental tackle\n\n"
            + "Description:\n"
            + "Young offensive lineman building versatility."
        ));

        mainPanel.add(createExpandable(
                "Joseph Noteboom – OT",
                "Stats:\n"
            + "• NFL starter experience\n\n"
            + "Description:\n"
            + "Veteran swing tackle offering depth and flexibility."
        ));

        // ---- Wide Receivers ----
        mainPanel.add(createExpandable(
                "Zay Flowers – WR",
                "Stats:\n"
            + "• 1,000+ receiving yards season\n\n"
            + "Description:\n"
            + "Explosive playmaker and primary receiving threat."
        ));

        mainPanel.add(createExpandable(
                "Rashod Bateman – WR",
                "Stats:\n"
            + "• Former 1st-round pick\n\n"
            + "Description:\n"
            + "Polished route runner with strong hands."
        ));

        mainPanel.add(createExpandable(
                "DeAndre Hopkins – WR",
                "Stats:\n"
            + "• All-Pro selections\n"
            + "• Career receiving yards: 12,000+\n\n"
            + "Description:\n"
            + "Elite veteran receiver known for contested catches."
        ));

        mainPanel.add(createExpandable(
                "Tylan Wallace – WR",
                "Stats:\n"
            + "• Special teams contributor\n\n"
            + "Description:\n"
            + "Depth receiver with value in coverage units."
        ));

        mainPanel.add(createExpandable(
                "Devontez Walker – WR",
                "Stats:\n"
            + "• College deep-threat specialist\n\n"
            + "Description:\n"
            + "Speed receiver capable of stretching defenses."
        ));

        mainPanel.add(createExpandable(
                "LaJohntay Wester – WR",
                "Stats:\n"
            + "• Slot production at college level\n\n"
            + "Description:\n"
            + "Agile receiver with return and slot potential."
        ));

        // ---- Defensive Front ----
        mainPanel.add(createExpandable(
                "Nnamdi Madubuike – DT",
                "Stats:\n"
            + "• Double-digit sack season\n\n"
            + "Description:\n"
            + "Interior disruptor and cornerstone of the defensive line."
        ));

        mainPanel.add(createExpandable(
                "Travis Jones – DT",
                "Stats:\n"
            + "• Strong run-stopping metrics\n\n"
            + "Description:\n"
            + "Power defensive tackle anchoring the interior."
        ));

        mainPanel.add(createExpandable(
                "Broderick Washington Jr. – DT",
                "Stats:\n"
            + "• Reliable rotational lineman\n\n"
            + "Description:\n"
            + "Provides depth and consistency up front."
        ));

        mainPanel.add(createExpandable(
                "John Jenkins – DT",
                "Stats:\n"
            + "• Veteran NFL experience\n\n"
            + "Description:\n"
            + "Run-stopping specialist with size and strength."
        ));

        // ---- Linebackers ----
        mainPanel.add(createExpandable(
                "Roquan Smith – LB",
                "Stats:\n"
            + "• All-Pro selections\n\n"
            + "Description:\n"
            + "Defensive leader and tackling machine."
        ));

        mainPanel.add(createExpandable(
                "Trenton Simpson – LB",
                "Stats:\n"
            + "• Speed and range metrics\n\n"
            + "Description:\n"
            + "Athletic linebacker with sideline-to-sideline ability."
        ));

        mainPanel.add(createExpandable(
                "Kyle Van Noy – OLB",
                "Stats:\n"
            + "• Veteran sacks and pressures\n\n"
            + "Description:\n"
            + "Experienced edge defender and situational pass rusher."
        ));

        // ---- Secondary ----
        mainPanel.add(createExpandable(
                "Marlon Humphrey – CB",
                "Stats:\n"
            + "• Pro Bowl CB\n\n"
            + "Description:\n"
            + "Physical cornerback and leader in the secondary."
        ));

        mainPanel.add(createExpandable(
                "Kyle Hamilton – SAF",
                "Stats:\n"
            + "• All-Pro selection\n\n"
            + "Description:\n"
            + "Versatile safety capable of playing all over the field."
        ));

        // ---- Specialists ----
        mainPanel.add(createExpandable(
                "Jordan Stout – P",
                "Stats:\n"
            + "• Strong net punting average\n\n"
            + "Description:\n"
            + "Primary punter handling field-position duties."
        ));

        mainPanel.add(createExpandable(
                "Tyler Loop – K",
                "Stats:\n"
            + "• College accuracy leader\n\n"
            + "Description:\n"
            + "Kicker responsible for field goals and kickoffs."
        ));

        // === COACHING STAFF ===
        mainPanel.add(sectionLabel("COACHING STAFF"));

        mainPanel.add(createExpandable(
                "John Harbaugh – Head Coach",
                "Role:\n"
            + "• Overall team leadership and vision\n"
            + "• Game management and decision-making\n"
            + "• Culture, discipline, and accountability\n\n"
            + "Description:\n"
            + "Super Bowl–winning head coach known for adaptability and long-term organizational stability."
        ));

        mainPanel.add(createExpandable(
                "Todd Monken – Offensive Coordinator",
                "Role:\n"
            + "• Offensive scheme design\n"
            + "• Play-calling and game planning\n"
            + "• Quarterback development\n\n"
            + "Description:\n"
            + "Architect of a modern, aggressive offense tailored to maximize player strengths."
        ));

        mainPanel.add(createExpandable(
                "Zachary Orr – Defensive Coordinator",
                "Role:\n"
            + "• Defensive play-calling\n"
            + "• Defensive strategy and adjustments\n\n"
            + "Description:\n"
            + "Former Ravens linebacker bringing an attacking, player-first defensive philosophy."
        ));

        mainPanel.add(createExpandable(
                "Chris Horton – Special Teams Coordinator",
                "Role:\n"
            + "• Special teams schemes\n"
            + "• Game-day execution\n\n"
            + "Description:\n"
            + "Oversees all kicking, coverage, and return units."
        ));

        mainPanel.add(createExpandable(
                "Willie Taggart – Assistant Head Coach / Running Backs Coach",
                "Role:\n"
            + "• Assists head coach with leadership duties\n"
            + "• Running back development\n\n"
            + "Description:\n"
            + "Provides veteran leadership and develops the team’s running back group."
        ));

        mainPanel.add(createExpandable(
                "Danny Breyer – Offensive Assistant Coach",
                "Role:\n"
            + "• Offensive game preparation\n"
            + "• Film breakdown and analytics support\n\n"
            + "Description:\n"
            + "Supports offensive planning and weekly preparation."
        ));

        mainPanel.add(createExpandable(
                "Randy Brown – Senior Special Teams Coach",
                "Role:\n"
            + "• Special teams fundamentals\n"
            + "• Veteran mentorship\n\n"
            + "Description:\n"
            + "Provides experienced guidance and technique development on special teams."
        ));

        mainPanel.add(createExpandable(
                "Brendan Clark – Defensive Quality Control Coach",
                "Role:\n"
            + "• Defensive film analysis\n"
            + "• Opponent scouting support\n\n"
            + "Description:\n"
            + "Assists defensive coaches with analytics, breakdowns, and preparation."
        ));

        mainPanel.add(createExpandable(
                "Donald D’Alesio – Defensive Backs Coach",
                "Role:\n"
            + "• Defensive back technique\n"
            + "• Coverage scheme implementation\n\n"
            + "Description:\n"
            + "Develops cornerbacks and safeties within the defensive system."
        ));

        mainPanel.add(createExpandable(
                "George Godsey – Tight Ends Coach",
                "Role:\n"
            + "• Tight end development\n"
            + "• Blocking and route responsibilities\n\n"
            + "Description:\n"
            + "Works with tight ends on versatility in both the run and pass game."
        ));

        mainPanel.add(createExpandable(
                "Dennis Johnson – Defensive Line Coach",
                "Role:\n"
            + "• Defensive line technique\n"
            + "• Run defense and pass rush\n\n"
            + "Description:\n"
            + "Coaches interior and edge linemen to control the line of scrimmage."
        ));

        mainPanel.add(createExpandable(
                "Anthony Levine Sr. – Assistant Special Teams Coach",
                "Role:\n"
            + "• Special teams preparation\n"
            + "• Player mentoring\n\n"
            + "Description:\n"
            + "Former player assisting with special teams execution and leadership."
        ));

        mainPanel.add(createExpandable(
                "Greg Lewis – Wide Receivers Coach",
                "Role:\n"
            + "• Wide receiver technique\n"
            + "• Route running and blocking\n\n"
            + "Description:\n"
            + "Develops wide receivers within the Ravens passing offense."
        ));

        mainPanel.add(createExpandable(
                "Tee Martin – Quarterbacks Coach",
                "Role:\n"
            + "• Quarterback mechanics\n"
            + "• Film study and decision-making\n\n"
            + "Description:\n"
            + "Works closely with quarterbacks to improve accuracy and command of the offense."
        ));

        mainPanel.add(createExpandable(
                "Chuck Pagano – Senior Defensive Assistant / Secondary Coach",
                "Role:\n"
            + "• Defensive strategy advising\n"
            + "• Secondary coaching support\n\n"
            + "Description:\n"
            + "Veteran coach providing experience and insight to the defensive staff."
        ));

        mainPanel.add(createExpandable(
                "Matt Pees – Assistant Linebackers Coach",
                "Role:\n"
            + "• Linebacker development\n"
            + "• Film study and drills\n\n"
            + "Description:\n"
            + "Assists with coaching linebackers and defensive preparation."
        ));

        mainPanel.add(createExpandable(
                "Matt Robinson – Outside Linebackers Coach",
                "Role:\n"
            + "• Edge rusher technique\n"
            + "• Pass rush coordination\n\n"
            + "Description:\n"
            + "Focuses on developing outside linebackers as pass rush threats."
        ));

        mainPanel.add(createExpandable(
                "Tyler Santucci – Inside Linebackers Coach",
                "Role:\n"
            + "• Inside linebacker fundamentals\n"
            + "• Run fits and coverage assignments\n\n"
            + "Description:\n"
            + "Develops inside linebackers within the defensive scheme."
        ));

        mainPanel.add(createExpandable(
                "Adam Schrack – Offensive Quality Control",
                "Role:\n"
            + "• Offensive analytics and breakdowns\n"
            + "• Weekly game prep\n\n"
            + "Description:\n"
            + "Supports offensive coaches with data and film analysis."
        ));

        mainPanel.add(createExpandable(
                "Chuck Smith – Pass Rush Coach",
                "Role:\n"
            + "• Pass rush technique\n"
            + "• Individual skill development\n\n"
            + "Description:\n"
            + "Specialist coach focusing on edge and interior pass rushing."
        ));

        mainPanel.add(createExpandable(
                "Travis Switzer – Run Game Coordinator",
                "Role:\n"
            + "• Run blocking schemes\n"
            + "• Coordination between OL, RBs, and TEs\n\n"
            + "Description:\n"
            + "Aligns run game concepts across offensive position groups."
        ));

        mainPanel.add(createExpandable(
                "George Warhop – Offensive Line Coach",
                "Role:\n"
            + "• Offensive line technique\n"
            + "• Pass protection and run blocking\n\n"
            + "Description:\n"
            + "Develops offensive linemen and ensures cohesive line play."
        ));

        mainPanel.add(createExpandable(
                "Travelle Wharton – Assistant Offensive Line Coach",
                "Role:\n"
            + "• Assists OL coaching\n"
            + "• Individual player development\n\n"
            + "Description:\n"
            + "Former NFL lineman supporting offensive line training and preparation."
        ));


        // === STRENGTH & CONDITIONING / COACH FELLOWS ===
        mainPanel.add(sectionLabel("STRENGTH & CONDITIONING / COACH FELLOWS"));

        mainPanel.add(createExpandable(
                "Scott Elliott – Strength & Conditioning Coordinator",
                "Role:\n"
            + "• Oversees all strength and conditioning programs\n"
            + "• Coordinates performance development across positions\n\n"
            + "Description:\n"
            + "Leads the Ravens’ physical development philosophy, focusing on strength, speed, and durability."
        ));

        mainPanel.add(createExpandable(
                "Kaelyn Buskey – Assistant Strength & Conditioning Coach",
                "Role:\n"
            + "• Assists with daily strength programs\n"
            + "• Player monitoring and recovery\n\n"
            + "Description:\n"
            + "Supports individualized training plans and recovery protocols for players."
        ));

        mainPanel.add(createExpandable(
                "Kevin Hartman – Assistant Strength & Conditioning Coach",
                "Role:\n"
            + "• Weight room supervision\n"
            + "• Conditioning and mobility work\n\n"
            + "Description:\n"
            + "Works closely with players to maintain conditioning and prevent soft-tissue injuries."
        ));

        mainPanel.add(createExpandable(
                "Connor Gorny – Applied Sports Scientist",
                "Role:\n"
            + "• Performance data analysis\n"
            + "• Load management and biometrics\n\n"
            + "Description:\n"
            + "Uses sports science and analytics to optimize training intensity and recovery strategies."
        ));

        mainPanel.add(createExpandable(
                "Prentice Gill – Coaching Fellow",
                "Role:\n"
            + "• Assists position coaches\n"
            + "• Practice and film support\n\n"
            + "Description:\n"
            + "Developing coach gaining hands-on experience through the Ravens Coaching Fellowship program."
        ));

        mainPanel.add(createExpandable(
                "Ian Kolste – Coaching Fellow",
                "Role:\n"
            + "• Practice organization assistance\n"
            + "• Player development support\n\n"
            + "Description:\n"
            + "Supports coaching operations while developing foundational coaching skills."
        ));

        mainPanel.add(createExpandable(
                "DP Eyman – Coaching Fellow",
                "Role:\n"
            + "• Defensive and special teams assistance\n"
            + "• Film breakdown and prep\n\n"
            + "Description:\n"
            + "Early-career coach contributing to preparation and on-field support duties."
        ));

        // === FRONT OFFICE ===
        mainPanel.add(sectionLabel("FRONT OFFICE"));

        mainPanel.add(createExpandable(
                "Eric DeCosta – Executive Vice President & General Manager",
                "Role:\n"
            + "• Oversees all football operations\n"
            + "• Final authority on roster construction\n"
            + "• Contract negotiations and salary cap strategy\n\n"
            + "Description:\n"
            + "Leads player personnel decisions and long-term team building strategy."
        ));

        mainPanel.add(createExpandable(
                "Ozzie Newsome – Executive Vice President",
                "Role:\n"
            + "• Senior football advisor\n"
            + "• Organizational leadership\n\n"
            + "Description:\n"
            + "Hall of Fame executive providing guidance on football operations and culture."
        ));

        mainPanel.add(createExpandable(
                "George Kokinis – Vice President, Player Personnel",
                "Role:\n"
            + "• Manages pro and college scouting departments\n"
            + "• Player acquisition strategy\n\n"
            + "Description:\n"
            + "Oversees evaluation of current players, free agents, and draft prospects."
        ));

        mainPanel.add(createExpandable(
                "Nick Matteo – Vice President, Football Administration",
                "Role:\n"
            + "• Contract administration\n"
            + "• Salary cap compliance\n\n"
            + "Description:\n"
            + "Handles financial and contractual logistics of football operations."
        ));

        mainPanel.add(createExpandable(
                "David McDonald – Vice President, Research & Development",
                "Role:\n"
            + "• Football analytics and data science\n"
            + "• Decision support systems\n\n"
            + "Description:\n"
            + "Leads analytics initiatives supporting scouting, strategy, and performance."
        ));

        mainPanel.add(createExpandable(
                "Mark Azevedo – Director of Player Personnel",
                "Role:\n"
            + "• Coordinates player evaluations\n"
            + "• Supports roster management\n\n"
            + "Description:\n"
            + "Bridges scouting, coaching, and front office decision-making."
        ));

        mainPanel.add(createExpandable(
                "Andrew Raphael – Director of College Scouting",
                "Role:\n"
            + "• Leads draft scouting operations\n"
            + "• College prospect evaluation\n\n"
            + "Description:\n"
            + "Manages nationwide scouting efforts for collegiate talent."
        ));

        mainPanel.add(createExpandable(
                "James Oncea – Director of Football Systems",
                "Role:\n"
            + "• Football technology infrastructure\n"
            + "• Systems integration and security\n\n"
            + "Description:\n"
            + "Maintains digital systems supporting football operations and analytics."
        ));

        mainPanel.add(createExpandable(
                "Jenn Hoffman – Chief of Staff to the General Manager",
                "Role:\n"
            + "• Executive coordination\n"
            + "• Strategic planning support\n\n"
            + "Description:\n"
            + "Ensures efficient communication and execution across football departments."
        ));

        mainPanel.add(createExpandable(
                "Bobby Vega – Senior Personnel Executive",
                "Role:\n"
            + "• Player evaluation and scouting leadership\n"
            + "• Personnel strategy\n\n"
            + "Description:\n"
            + "Provides senior-level expertise in player assessment and roster planning."
        ));

        mainPanel.add(createExpandable(
                "Valarie Wideman – Player Services Manager",
                "Role:\n"
            + "• Player support and logistics\n"
            + "• Off-field services coordination\n\n"
            + "Description:\n"
            + "Assists players with relocation, benefits, and personal support services."
        ));

        mainPanel.add(createExpandable(
                "O.J. Brigance – Senior Advisor to Player Engagement",
                "Role:\n"
            + "• Player wellness and engagement programs\n"
            + "• Leadership development\n\n"
            + "Description:\n"
            + "Supports players’ personal growth, resilience, and community involvement."
        ));

        mainPanel.add(createExpandable(
                "Johnny Shelton – Team Chaplain",
                "Role:\n"
            + "• Spiritual support\n"
            + "• Counseling and guidance\n\n"
            + "Description:\n"
            + "Provides faith-based counseling and confidential support to players and staff."
        ));

        // === ATHLETIC TRAINING & MEDICAL ===
        mainPanel.add(sectionLabel("ATHLETIC TRAINING & MEDICAL"));

        mainPanel.add(createExpandable(
                "Dr. Andrew Tucker – Chief Medical Officer",
                "Role:\n"
            + "• Oversees all medical operations\n"
            + "• Final authority on player health decisions\n\n"
            + "Description:\n"
            + "Leads the Ravens’ medical program and coordinates care across all specialties."
        ));

        mainPanel.add(createExpandable(
                "Dr. Tricia Bent-Goodley – Team Clinician",
                "Role:\n"
            + "• Mental health and wellness support\n"
            + "• Crisis intervention\n\n"
            + "Description:\n"
            + "Provides psychological and emotional support services for players and staff."
        ));

        mainPanel.add(createExpandable(
                "Adrian Dixon – Head Certified Athletic Trainer",
                "Role:\n"
            + "• Manages athletic training staff\n"
            + "• Injury prevention and evaluation\n"
            + "• Game-day medical coordination\n\n"
            + "Description:\n"
            + "Primary liaison between coaching staff, players, and medical personnel."
        ));

        mainPanel.add(createExpandable(
                "Chris Marroquin – Director of Player Rehabilitation",
                "Role:\n"
            + "• Oversees injury rehab programs\n"
            + "• Return-to-play planning\n\n"
            + "Description:\n"
            + "Designs and supervises rehabilitation pathways for injured players."
        ));

        mainPanel.add(createExpandable(
                "Ron Medlin – Senior Assistant Athletic Trainer",
                "Role:\n"
            + "• Advanced injury treatment\n"
            + "• Practice and game support\n\n"
            + "Description:\n"
            + "Veteran trainer assisting with complex recovery cases and daily player care."
        ));

        mainPanel.add(createExpandable(
                "Kevin Domboski – Associate Head Athletic Trainer",
                "Role:\n"
            + "• Assists head athletic trainer\n"
            + "• Coordinates treatment schedules\n\n"
            + "Description:\n"
            + "Supports department leadership and manages day-to-day treatment logistics."
        ));

        mainPanel.add(createExpandable(
                "Michael Blankenship – Senior Physical Therapist",
                "Role:\n"
            + "• Physical therapy and mobility\n"
            + "• Post-surgical rehabilitation\n\n"
            + "Description:\n"
            + "Specializes in restoring strength, flexibility, and movement efficiency."
        ));

        mainPanel.add(createExpandable(
                "Cross Klemko – Assistant Athletic Trainer",
                "Role:\n"
            + "• On-field injury response\n"
            + "• Player taping and prep\n\n"
            + "Description:\n"
            + "Provides hands-on support during practices and games."
        ));

        mainPanel.add(createExpandable(
                "Mike Thomas – Performance Therapist",
                "Role:\n"
            + "• Soft-tissue therapy\n"
            + "• Recovery optimization\n\n"
            + "Description:\n"
            + "Focuses on muscle recovery, load management, and performance longevity."
        ));

        mainPanel.add(createExpandable(
                "Kim Niggel – Medical Services Manager",
                "Role:\n"
            + "• Medical operations management\n"
            + "• Scheduling and compliance\n\n"
            + "Description:\n"
            + "Ensures smooth coordination of medical services and documentation."
        ));


        JScrollPane scrollPane = new JScrollPane(mainPanel);
        frame.add(scrollPane);
        frame.setVisible(true);
        scrollPane.getVerticalScrollBar().setUnitIncrement(20);
    }

    // === Helper: Section Label ===
    public static JLabel sectionLabel(String title) {
        return sectionLabel(title, Component.LEFT_ALIGNMENT, Color.BLACK, 16);
    }

    // Left-aligned, custom color, default font size 16
    public static JLabel sectionLabel(String title, Color color) {
        return sectionLabel(title, Component.LEFT_ALIGNMENT, color, 16);
    }

    // Left-aligned, custom font size, default color black
    public static JLabel sectionLabel(String title, int fontSize) {
        return sectionLabel(title, Component.LEFT_ALIGNMENT, Color.BLACK, fontSize);
    }

    // Custom alignment, color, default font size 16
    public static JLabel sectionLabel(String title, float alignmentX, Color color) {
        return sectionLabel(title, alignmentX, color, 16);
    }

    public static JLabel sectionLabel(String title, Color color, int size) {
        return sectionLabel(title, Component.LEFT_ALIGNMENT, color, size);
    }

    // Full customization: alignment, color, font size
    public static JLabel sectionLabel(String title, float alignmentX, Color color, int fontSize) {
        JLabel label = new JLabel(title);
        label.setFont(label.getFont().deriveFont((float) fontSize).deriveFont(java.awt.Font.BOLD));
        label.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 10));

        // Force preferred size so it doesn't stretch horizontally
        Dimension pref = label.getPreferredSize();
        label.setMaximumSize(new Dimension(pref.width, Short.MAX_VALUE));

        // Set alignment
        label.setAlignmentX(alignmentX);

        // Set text color
        label.setForeground(color);

        return label;
    }
    // === Helper: Expandable Component ===
    private static JPanel createExpandable(String title, String details) {
        JPanel container = new JPanel();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        container.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

        JButton button = new JButton(title);
        button.setAlignmentX(Component.LEFT_ALIGNMENT);
        Dimension pref = button.getPreferredSize();
        button.setMaximumSize(new Dimension(pref.width, Short.MAX_VALUE));
        button.setBackground(Color.WHITE);

        JTextArea detailArea = new JTextArea(details);
        detailArea.setEditable(false);
        detailArea.setLineWrap(true);
        detailArea.setWrapStyleWord(true);
        detailArea.setVisible(false);
        detailArea.setBackground(new Color(245, 245, 245));
        detailArea.setBorder(BorderFactory.createEmptyBorder(8, 12, 8, 12));

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detailArea.setVisible(!detailArea.isVisible());
                container.revalidate();
            }
        });

        container.add(button);
        container.add(detailArea);
        return container;
    }
}
