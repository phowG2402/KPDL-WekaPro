/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekapro;

/**
 *
 * @author Admin
 */
public class WekaPro {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
//        MyKnowledgeModel model = new MyKnowledgeModel(
//                "C:\\Program Files\\Weka-3-8-5\\data\\iris.arff");
//        
//        System.out.println(model);
//        model.saveData("C:\\iris.arff");
//        model.saveData2CSV("C:\\iris.csv");
        
//        MyAprioriModel model = new MyAprioriModel(
//                "C:\\Program Files\\Weka-3-8-5\\data\\weather.numeric.arff",
//                "-N 10 -T 0 -C 0.9 -D 0.05 -U 1.0 -M 0.15 -S -1.0 -c -1",
//                "-R 2-3");
//        model.mineAssociatetionRules();
//        System.out.print(model);

//        MyFPGrowthModel model = new MyFPGrowthModel(
//                "C:\\Program Files\\Weka-3-8-5\\data\\weather.nominal.arff",
//                "-P 2 -I -1 -N 10 -T 0 -C 0.8 -D 0.05 -U 1.0 -M 0.2",
//                "-N -R first-last"
//        );
//        
//        model.mineAssociationRule();
//        System.out.print(model);

        MyKnowledgeModel model = new MyKnowledgeModel(
                "C:\\Program Files\\Weka-3-8-5\\data\\iris.arff", null, null);
        model.trainset = model.divideTrainTestResample(model.dataset, 80, false);
        model.testset = model.divideTrainTestResample(model.dataset, 80, true);
        System.out.print(model);
        System.out.print(model.trainset.toSummaryString());
        System.out.print(model.testset.toSummaryString());
    }
    
}
