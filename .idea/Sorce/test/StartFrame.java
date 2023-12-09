import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;



public class StartFrame extends JFrame implements ActionListener {
    private int id;
    private String zone;
    private String eat;
    private String color;
    private String name;

    public static int nextVegetableID = 1;
    public String tempzone;
    public String tempeat;
    public String tempcolor;
    public String tempname;

    Vegetable vegetable;
    BinarySearchTree BinaryTree = new BinarySearchTree();



        JFrame MainFrame;


        JTextField SeachVegetableName,InsertVegetableName,DeleteVegetableName;
        JPanel RealUsePanal,MainPanel,SeachPanal,InsertPanal,DeletePanal,TypePanal,EatPanal,ColorPanal,NamePanal,AbsoluteNamePanal,ResultPanal, SeachNamePanal,DeleteNamePanal;
        JButton SeachButton, InsertButton,DeleteButton,SeachAbsoluteButton,SeachLooseButton,DeleteAbsoluteButton,DeleteLooseButton,
                 GroundButton,WaterButton,
                FlowerButton,BranchButton,BodyButton,RootButton,LeafButton,

    SubmitInsertNameButton, SubmitDeleteNameButton, SubmitSeachNameButton,
               RedButton,YellowButton,GreenButton, PurpleButton,OrangeButton,BrownButton,WhiteButton,
               BacktoMainButton,BacktoTypeButton,BacktoEatButton,BacktoColorButton,BacktoMainButtonSecond,BacktoMainButtonThird;

        JLabel PictureLabel,AbsolutenameResultLabel;
        JTextArea ResultTextArea;

////////////////////////////////////////////////////////////////////////////////////////////////////
    private static java.util.List<Vegetable> searchVegetableByName(BinarySearchTree tree, String name) {
        java.util.List<Vegetable> foundVegetables = new ArrayList<>();
        searchVegetableByNameRec(tree.getRoot(), name, foundVegetables);
        return foundVegetables;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////
    private static void searchVegetableByNameRec(MyNode root, String name, List<Vegetable> foundVegetables) {
        if (root != null) {
            for (Vegetable vegetable : root.vegetables) {
                if (vegetable.getName().equalsIgnoreCase(name)) {
                    foundVegetables.add(vegetable);
                }
            }
            searchVegetableByNameRec(root.left, name, foundVegetables);
            searchVegetableByNameRec(root.right, name, foundVegetables);
        }
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////

    StartFrame() {


/*JLabel*/
        PictureLabel = new JLabel();
        PictureLabel.setText("Insert Picture");
        PictureLabel.setBounds(300,0, 200, 200);
       PictureLabel.setVerticalAlignment(JLabel.CENTER);
       PictureLabel.setBackground(Color.LIGHT_GRAY);
      //  BackGroudPanal.setHorizontalAlignment(JLabel.CENTER);
/*JPanel*/
        MainPanel = new JPanel(new CardLayout());
        MainPanel.setBackground(Color.white);
        MainPanel.setBounds(0,0, 900, 600);
      //  MainPanel.setLayout(new BorderLayout());


/*JButton*/
        SeachButton = new JButton();
        SeachButton.setBounds(400,100,100,50);
        SeachButton.setText("Search");
        SeachButton.setBackground(Color.LIGHT_GRAY);
        SeachButton.setFocusable(false);
        SeachButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    RealUsePanal.setVisible(false);
                    SeachPanal.setVisible(true);
            }
        });

        DeleteVegetableName = new JTextField();
        DeleteVegetableName.setColumns(10);
        DeleteVegetableName.setBounds(350,100,200,50);

        SubmitDeleteNameButton = new JButton();
        SubmitDeleteNameButton.setBounds(350,170,200,50);
        SubmitDeleteNameButton.setText("Submit");
        SubmitDeleteNameButton.setBackground(Color.LIGHT_GRAY);
        SubmitDeleteNameButton.setFocusable(false);
        SubmitDeleteNameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tempname = DeleteVegetableName.getText();
                System.out.println(tempname);
                BinaryTree.delete(tempname);
            }
        });

        BacktoMainButton = new JButton();
        BacktoMainButton.setBounds(350,310,200,50);
        BacktoMainButton.setText("Back to Main menu");
        BacktoMainButton.setBackground(Color.LIGHT_GRAY);
        BacktoMainButton.setFocusable(false);
        BacktoMainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NamePanal.setVisible(false);
                RealUsePanal.setVisible(true);
            }
        });

        InsertButton = new JButton();
        InsertButton.setBounds(400,170,100,50);
        InsertButton.setText("Insert");
        InsertButton.setBackground(Color.LIGHT_GRAY);
        InsertButton.setFocusable(false);
        InsertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                    RealUsePanal.setVisible(false);
                    TypePanal.setVisible(true);
            }
        });

        SubmitSeachNameButton = new JButton();
        SubmitSeachNameButton.setBounds(350,170,200,50);
        SubmitSeachNameButton.setText("Submit");
        SubmitSeachNameButton.setBackground(Color.LIGHT_GRAY);
        SubmitSeachNameButton.setFocusable(false);

        DeleteButton = new JButton();
        DeleteButton.setBounds(400,240,100,50);
        DeleteButton.setText("Delete");
        DeleteButton.setBackground(Color.LIGHT_GRAY);
        DeleteButton.setFocusable(false);
        DeleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RealUsePanal.setVisible(false);
                DeletePanal.setVisible(true);
            }
        });
/*JFrame*/
        MainFrame = new JFrame();
        MainFrame.setSize(900,600);
        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainFrame.setResizable(false);
        MainFrame.setLayout(null);
      //  MainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        MainFrame.setVisible(true);
        MainFrame.setLocation(100,100);
/*frame add*/
        MainFrame.add(MainPanel);
        RealUsePanal = new JPanel();
        RealUsePanal.setLayout(null);
        MainPanel.add(RealUsePanal);
//        frame1.add(blue);
       // MainPanel.add(BackGroudPanal);
        RealUsePanal.add(SeachButton);
        RealUsePanal.add(InsertButton);
        RealUsePanal.add(DeleteButton);


        //SeachPanal

        SeachAbsoluteButton = new JButton();
        SeachAbsoluteButton.setBounds(350,100,200,50);
        SeachAbsoluteButton.setText("Search by name");
        SeachAbsoluteButton.setBackground(Color.LIGHT_GRAY);
        SeachAbsoluteButton.setFocusable(false);
        SeachAbsoluteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SeachPanal.setVisible(false);
               SeachNamePanal.setVisible(true);
            }
        });

        BacktoMainButtonSecond = new JButton();
        BacktoMainButtonSecond.setBounds(350,310,200,50);
        BacktoMainButtonSecond.setText("Back to Main menu");
        BacktoMainButtonSecond.setBackground(Color.LIGHT_GRAY);
        BacktoMainButtonSecond.setFocusable(false);
        BacktoMainButtonSecond.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SeachNamePanal.setVisible(false);
                RealUsePanal.setVisible(true);
            }
        });

        BacktoMainButtonThird = new JButton();
        BacktoMainButtonThird.setBounds(350,310,200,50);
        BacktoMainButtonThird.setText("Back to Main menu");
        BacktoMainButtonThird.setBackground(Color.LIGHT_GRAY);
        BacktoMainButtonThird.setFocusable(false);
        BacktoMainButtonThird.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DeleteNamePanal.setVisible(false);
                RealUsePanal.setVisible(true);
            }
        });



        //////////////////////////////////////////////////
        SeachLooseButton = new JButton();
        SeachLooseButton.setBounds(350,170,200,50);
        SeachLooseButton.setText("Search by keyword");
        SeachLooseButton.setBackground(Color.LIGHT_GRAY);
        SeachLooseButton.setFocusable(false);
        SeachLooseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SeachPanal.setVisible(false);

            }
        });
        ////////////////////////////////////////////////////
        SeachPanal = new JPanel();
        MainPanel.add(SeachPanal);
        SeachPanal.setVisible(false);
        SeachPanal.setLayout(null);
        SeachPanal.setBackground(Color.LIGHT_GRAY);

        SeachPanal.add(SeachAbsoluteButton);

/////////////////////////////////////////////////////////////////////

        //Typepanal
        GroundButton = new JButton();
        GroundButton.setBounds(350,100,200,50);
        GroundButton.setText("Plant on ground");
        GroundButton.setBackground(Color.LIGHT_GRAY);
        GroundButton.setFocusable(false);
        GroundButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                     tempzone = "ground";
                    TypePanal.setVisible(false);
                    EatPanal.setVisible(true);
                }

        });
        ///////////////////////////////////////////////////////////////
        WaterButton = new JButton();
        WaterButton.setBounds(350,170,200,50);
        WaterButton.setText("Plant on water");
        WaterButton.setBackground(Color.LIGHT_GRAY);
        WaterButton.setFocusable(false);
        WaterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 tempzone = "water";
                TypePanal.setVisible(false);
                EatPanal.setVisible(true);
            }
        });
        ///////////////////////////////////////////////////////////////
        TypePanal = new JPanel();
        MainPanel.add(TypePanal);
        TypePanal.setVisible(false);
        TypePanal.setLayout(null);
        TypePanal.setBackground(Color.LIGHT_GRAY);
        TypePanal.add(GroundButton);
        TypePanal.add(WaterButton);
          //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Eatpanal
        RootButton = new JButton();
        RootButton.setBounds(350,100,200,50);
        RootButton.setText("Root");
        RootButton.setBackground(Color.LIGHT_GRAY);
        RootButton.setFocusable(false);
        RootButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 tempeat = "root";
                EatPanal.setVisible(false);
                ColorPanal.setVisible(true);
                                         }
        });
        /////////////////////////////////////////////////////////////////////
        BodyButton = new JButton();
        BodyButton.setBounds(350,170,200,50);
        BodyButton.setText("Body");
        BodyButton.setBackground(Color.LIGHT_GRAY);
        BodyButton.setFocusable(false);
        BodyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 tempeat = "body";
                EatPanal.setVisible(false);
                ColorPanal.setVisible(true);
            }
        });
        ////////////////////////////////////////////////////////////////////
        LeafButton = new JButton();
        LeafButton.setBounds(350,240,200,50);
        LeafButton.setText("Leaf");
        LeafButton.setBackground(Color.LIGHT_GRAY);
        LeafButton.setFocusable(false);
        LeafButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 tempeat = "leaf";
                EatPanal.setVisible(false);
                ColorPanal.setVisible(true);
            }
        });
        ///////////////////////////////////////////////////////////////////
        BranchButton = new JButton();
        BranchButton.setBounds(350,310,200,50);
        BranchButton.setText("Branch");
        BranchButton.setBackground(Color.LIGHT_GRAY);
        BranchButton.setFocusable(false);
        BranchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 tempeat = "branch";
                EatPanal.setVisible(false);
                ColorPanal.setVisible(true);
            }
        });
        ///////////////////////////////////////////////////////////////////
        FlowerButton = new JButton();
        FlowerButton.setBounds(350,380,200,50);
        FlowerButton.setText("Flower");
        FlowerButton.setBackground(Color.LIGHT_GRAY);
        FlowerButton.setFocusable(false);
        FlowerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 tempeat = "flower";
                EatPanal.setVisible(false);
                ColorPanal.setVisible(true);
            }
        });
    /////////////////////////////////////////////////////////////////////
        EatPanal = new JPanel();
        MainPanel.add(EatPanal);
        EatPanal.setVisible(false);
        EatPanal.setLayout(null);
        EatPanal.setBackground(Color.LIGHT_GRAY);
        EatPanal.add(RootButton);
        EatPanal.add(BodyButton);
        EatPanal.add(LeafButton);
        EatPanal.add(FlowerButton);
        EatPanal.add(BranchButton);
/////////////////////////////////////////////////////////////////////
        //DeletePane
        DeletePanal = new JPanel();
        MainPanel.add(DeletePanal);
        DeletePanal.setVisible(false);
        DeletePanal.setLayout(null);
        DeletePanal.setBackground(Color.LIGHT_GRAY);
/////////////////////////////////////////////////////////////////////
        DeleteAbsoluteButton = new JButton();
        DeleteAbsoluteButton.setBounds(350,100,200,50);
        DeleteAbsoluteButton.setText("Delete by name");
        DeleteAbsoluteButton.setBackground(Color.LIGHT_GRAY);
        DeleteAbsoluteButton.setFocusable(false);
        DeleteAbsoluteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DeletePanal.setVisible(false);
                DeleteNamePanal.setVisible(true);
            }
        });
        //////////////////////////////////////////////////
        DeleteLooseButton = new JButton();
        DeleteLooseButton.setBounds(350,170,200,50);
        DeleteLooseButton.setText("Delete by keyword");
        DeleteLooseButton.setBackground(Color.LIGHT_GRAY);
        DeleteLooseButton.setFocusable(false);
        DeleteLooseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DeletePanal.setVisible(false);
                TypePanal.setVisible(true);
            }
        });
        ////////////////////////////////////////////////////
        DeletePanal = new JPanel();
        MainPanel.add(DeletePanal);
        DeletePanal.setVisible(false);
        DeletePanal.setLayout(null);
        DeletePanal.setBackground(Color.LIGHT_GRAY);

        DeletePanal.add(DeleteAbsoluteButton);

/////////////////////////////////////////////////////////////////////

        //ColorPane
        PurpleButton = new JButton();
        PurpleButton.setBounds(350,100-20,200,50);
        PurpleButton.setText("Purple");
        PurpleButton.setBackground(Color.LIGHT_GRAY);
        PurpleButton.setFocusable(false);
        PurpleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 tempcolor = "purple";
                ColorPanal.setVisible(false);
                NamePanal.setVisible(true);
            }
        });
        RedButton = new JButton();
        RedButton.setBounds(350,170-20,200,50);
        RedButton.setText("Red");
        RedButton.setBackground(Color.LIGHT_GRAY);
        RedButton.setFocusable(false);
        RedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 tempcolor = "red";
                ColorPanal.setVisible(false);
                NamePanal.setVisible(true);
            }
        });
        OrangeButton = new JButton();
        OrangeButton.setBounds(350,240-20,200,50);
        OrangeButton.setText("Orange");
        OrangeButton.setBackground(Color.LIGHT_GRAY);
        OrangeButton.setFocusable(false);
        OrangeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 tempcolor = "orange";
                ColorPanal.setVisible(false);
                NamePanal.setVisible(true);
            }
        });
        YellowButton = new JButton();
        YellowButton.setBounds(350,310-20,200,50);
        YellowButton.setText("Yellow");
        YellowButton.setBackground(Color.LIGHT_GRAY);
        YellowButton.setFocusable(false);
        YellowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 tempcolor = "yellow";
                ColorPanal.setVisible(false);
                NamePanal.setVisible(true);
            }
        });
        GreenButton = new JButton();
        GreenButton.setBounds(350,380-20,200,50);
        GreenButton.setText("Green");
        GreenButton.setBackground(Color.LIGHT_GRAY);
        GreenButton.setFocusable(false);
        GreenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 tempcolor = "green";
                ColorPanal.setVisible(false);
                NamePanal.setVisible(true);
            }
        });
        BrownButton = new JButton();
        BrownButton.setBounds(350,450-20,200,50);
        BrownButton.setText("Brown");
        BrownButton.setBackground(Color.LIGHT_GRAY);
        BrownButton.setFocusable(false);
        BrownButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 tempcolor = "brown";
                ColorPanal.setVisible(false);
                NamePanal.setVisible(true);
            }
        });
        WhiteButton = new JButton();
        WhiteButton.setBounds(350,520-20,200,50);
        WhiteButton.setText("White");
        WhiteButton.setBackground(Color.LIGHT_GRAY);
        WhiteButton.setFocusable(false);
        WhiteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 tempcolor = "white";
                ColorPanal.setVisible(false);
                NamePanal.setVisible(true);
            }
        });





        ColorPanal = new JPanel();
        MainPanel.add(ColorPanal);
        ColorPanal.setVisible(false);
        ColorPanal.setLayout(null);
        ColorPanal.setBackground(Color.LIGHT_GRAY);
        ColorPanal.add(RedButton);
        ColorPanal.add(OrangeButton);
        ColorPanal.add(PurpleButton);
        ColorPanal.add(GreenButton);
        ColorPanal.add(YellowButton);
        ColorPanal.add(BrownButton);
        ColorPanal.add(WhiteButton);

        //////////////////////////////////////////////////////////////

        SeachVegetableName = new JTextField();
        SeachVegetableName.setColumns(10);
        SeachVegetableName.setBounds(350,100,200,50);



        SubmitSeachNameButton = new JButton();
        SubmitSeachNameButton.setBounds(350,170,200,50);
        SubmitSeachNameButton.setText("Submit");
        SubmitSeachNameButton.setBackground(Color.LIGHT_GRAY);
        SubmitSeachNameButton.setFocusable(false);
        SubmitSeachNameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tempname = SeachVegetableName.getText();
                vegetable = new Vegetable(nextVegetableID,tempzone,tempcolor,tempeat,tempname);
                BinaryTree.insert(vegetable);
                SeachNamePanal.setVisible(false);
                System.out.println();
                ResultTextArea.append("");
                ResultPanal.setVisible(true);
                nextVegetableID++;
                BinaryTree.inOrder(tempzone, tempcolor, tempeat);
            }
        });
        
        
        InsertVegetableName = new JTextField();
        InsertVegetableName.setColumns(10);
        InsertVegetableName.setBounds(350,100,200,50);

        SubmitInsertNameButton = new JButton();
        SubmitInsertNameButton.setBounds(350,170,200,50);
        SubmitInsertNameButton.setText("Submit");
        SubmitInsertNameButton.setBackground(Color.LIGHT_GRAY);
        SubmitInsertNameButton.setFocusable(false);
        SubmitInsertNameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tempname = InsertVegetableName.getText();
                System.out.println(tempname);
                System.out.println(searchVegetableByName(BinaryTree, tempname));


            }
        });



        NamePanal = new JPanel();
        MainPanel.add(NamePanal);
        NamePanal.setVisible(false);
        NamePanal.setLayout(null);
        NamePanal.setBackground(Color.LIGHT_GRAY);
        NamePanal.add(SeachVegetableName);
        NamePanal.add(SubmitSeachNameButton);
        NamePanal.add(BacktoMainButton);


        SeachNamePanal = new JPanel();
        MainPanel.add(SeachNamePanal);
        SeachNamePanal.setVisible(false);
        SeachNamePanal.setLayout(null);
        SeachNamePanal.setBackground(Color.LIGHT_GRAY);
        SeachNamePanal.add(InsertVegetableName);
        SeachNamePanal.add(SubmitInsertNameButton);


        DeleteNamePanal = new JPanel();
        MainPanel.add( DeleteNamePanal);
        DeleteNamePanal.setVisible(false);
        DeleteNamePanal.setLayout(null);
        DeleteNamePanal.setBackground(Color.LIGHT_GRAY);
        DeleteNamePanal.add(DeleteVegetableName);
        DeleteNamePanal.add(SubmitDeleteNameButton);
        DeleteNamePanal.add(BacktoMainButtonThird);
        SeachNamePanal.add(BacktoMainButtonSecond);






        ResultPanal = new JPanel();
        MainPanel.add(ResultPanal);
        ResultPanal.setVisible(false);
        ResultPanal.setLayout(null);
        ResultPanal.setBackground(Color.LIGHT_GRAY);


        ResultTextArea = new JTextArea();
        ResultTextArea.setEditable(false);
        JScrollPane ResultScollPane = new JScrollPane(ResultTextArea);
        ResultPanal.add(ResultScollPane);



















    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }//ActionListen
}
//sceenSize(x,y) = 2000, 2000
/*JLabel*/
/*JPanel*/
/*JButton*/
/*JFrame*/
/*Frame Add*/