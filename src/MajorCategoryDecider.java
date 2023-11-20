import java.util.Scanner;
public class MajorCategoryDecider {
    private String inputName;

    public MajorCategoryDecider(String name) {
        this.inputName = name;
    }

    public void decideCTEMajor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you interesting in designing aircraft/airplanes? (Aerospace)  (yes/no)");
        String aerospace = scanner.nextLine();
        if (aerospace.equals("yes")) {
            System.out.println("Hey " + inputName + ", you should consider Aerospace Engineering. Look at the bths website for more info!");
        } else {
            System.out.println("Are you interested in the design of making buildings, highways, airports etc., or that plus with math and physics involved? (first option/second option)");
            String architecturalVsCivilEngineering = scanner.nextLine();

            if (architecturalVsCivilEngineering.equals("first option")) {
                System.out.println("Hey " + inputName + ", you should do Architectural Engineering. Look at the bths website for more info!");
            } else if (architecturalVsCivilEngineering.equals("second option")) {
                System.out.println("Hey " + inputName + ", you should do Civil Engineering. Look at the bths website for more info!");
            } else {

                System.out.println("Are you interested in media production, communication, and editing?  (yes/no)");
                String mediaCommunications = scanner.nextLine();
                if (mediaCommunications.equals("yes")) {
                    System.out.println("Hey " + inputName + ", you should consider Media Communications. Look at the bths website for more info!");
                } else {

                    System.out.println("Are you interested in electric circuits, mechanics, or coding(electric circuits/coding/all) ");
                    String Engineering = scanner.nextLine();
                    if (Engineering.equals("electric circuits")) {
                        System.out.println("Hey " + inputName + ", you should do Electrical Engineering. Look at the bths website for more info!");
                    } else if (Engineering.equals("coding")) {
                        System.out.println("Hey " + inputName + ", you should do software engineering. Look at the bths website for more info!");
                    } else if (Engineering.equals("all")) {
                        System.out.println("Hey " + inputName + ", you should do Mechatronics and Robotics. Look at the bths website for more info! ");
                    }

                    System.out.println("Did you like the class DDP last year? (yes/no)");
                    String industrialDesign = scanner.nextLine();
                    if (industrialDesign.equals("yes")) {
                        System.out.println("Hey " + inputName + ", you should consider Industrial Design. Look at the bths website for more info!");
                    } else {
                        System.out.println("Hey " + inputName + ", try going to the major fair to see more about the cte majors!");
                    }
                }
            }
        }
    }

    public void decideScienceMajor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you interested in living organisms, diseases, and the medical/Pharmaceutical industry? (yes/no)");
        String biorelated = scanner.nextLine();

        if (biorelated.equals("yes")) {
            System.out.println("Are you more interested in biology or the implementation of it in the medical/pharmaceutical industry? (first option/second option)");
            String bioOrMed = scanner.nextLine();

            if (bioOrMed.equals("first option")) {
                System.out.println("Hey" + inputName + ", you should biology. Look at the bths website for more info!");
            } else if (bioOrMed.equals("second option")) {
                System.out.println("Are you more interested in the general medical industry or the pharmaceutical industry? (first option/second option) ");
                String MorP = scanner.nextLine();
                if (MorP.equals("first option ")) {
                    System.out.println("Hey" + inputName + ", you should do Advanced health professions. Look at the bths website for more info!");
                } else if (MorP.equals("first option ")) {
                    System.out.println("Hey" + inputName + ", you should do LIU PHARMD. Look at the bths website for more info!");
                } else {
                    System.out.println("Do you like physics and or interested in astronomy? (yes/no)");
                    String Physics = scanner.nextLine();
                    if (Physics.equals("yes")) {
                        System.out.println("Hey " + inputName + ", you should consider Physics. Look at the bths website for more info!");
                    } else {
                        System.out.println("Do you like or have interest in math? (yes/no)");
                        String Math = scanner.nextLine();
                        if (Math.equals("yes")) {
                            System.out.println("Hey " + inputName + ", you should consider APPLIED MATHEMATICS . Look at the bths website for more info!");
                        } else {
                            System.out.println("Do you like or have interest in chemistry and oor like the class? (yes/no)");
                            String Chemistry = scanner.nextLine();
                            if (Chemistry.equals("yes")) {
                                System.out.println("Hey " + inputName + ", you should consider chemistry . Look at the bths website for more info!");
                            } else {
                                System.out.println("Do you like or have interest in environmental science and or have concern about climate change? (yes/no)");
                                String environmentalSci = scanner.nextLine();
                                if (environmentalSci.equals("yes")) {
                                    System.out.println("Hey " + inputName + ", you should consider environmental science . Look at the bths website for more info!");
                                } else {
                                    System.out.print("Hey" + inputName + ", try going to the major fair to see more about the science majors!");
                                }
                            }
                        }

                    }

                }
            }
        }
    }

    public void decideNonSTEMMajor() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Are you interested in Social sciences (yes/no)");
        String Ss = scanner.nextLine();
        if (Ss.equals("yes")) {
            System.out.println("Are you interested in Law Or social science research? (first option/second option");
       String LawOrSs = scanner.nextLine();
            if (LawOrSs.equals("first option")) {
                System.out.println("Hey " + inputName + ", you should consider Law and Society. Look at the BTHS website for more info!");
            } else if (LawOrSs.equals("second option")) {
                System.out.println("Hey " + inputName + ", you should consider Social Science Research. Look at the BTHS website for more info!");

            } else {
                System.out.println("Do you like or have interest business and/or finance? (yes/no)");
                String finance = scanner.nextLine();
                if (finance.equals("yes")) {
                    System.out.println("Hey " + inputName + ", you should consider finance . Look at the bths website for more info!");
                } else {
                    System.out.print("Hey" + inputName + ", try going to the major fair to see more about the non-Stem majors!");
                }


            }
        }
    }
}
