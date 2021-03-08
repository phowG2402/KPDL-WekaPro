/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekapro;

import weka.associations.FPGrowth;
import weka.core.Instances;

/**
 *
 * @author Admin
 */
public class MyFPGrowthModel extends MyKnowledgeModel {
    Instances newData;
    FPGrowth fpg;

    public MyFPGrowthModel(String filename, String m_opts, String d_opts) throws Exception {
        super(filename, m_opts, d_opts);
        this.fpg = new FPGrowth();
    }
    
    public void mineAssociationRule() throws Exception{
        this.newData = convert2Binary(this.dataset);
        fpg.setOptions(this.model_options);
        fpg.buildAssociations(newData);
    }

    @Override
    public String toString() {
        return fpg.toString();
    }
    
    
}
