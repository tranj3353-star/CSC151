import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    }

    // === Helper: Section Label ===
    private static JLabel sectionLabel(String text) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("Arial", Font.BOLD, 18));
        label.setBorder(BorderFactory.createEmptyBorder(15, 10, 5, 10));
        return label;
    }

    // === Helper: Expandable Component ===
    private static JPanel createExpandable(String title, String details) {
        JPanel container = new JPanel();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        container.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

        JButton button = new JButton(title);
        button.setAlignmentX(Component.LEFT_ALIGNMENT);

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
