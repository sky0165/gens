/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package iffClasses;

import gens.uData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author hedkandi
 */
public final class iffAuxPart extends iffClasses.iffBase {

    // base should be equal to iffBase.getColNum()
    private final int base = iffBase.base;
    public short U14 = 0; 
    public short U33 = 0; 
    public short U34 = 0; 
    public short U35 = 0; 
    public short U36 = 0; 
    public short U37 = 0; 
    public short U38 = 0; 
    public short U39 = 0; 
    public short U40 = 0; 
    public short U41 = 0; 
    public short U42 = 0; 
    public short U43 = 0; 
    public short U44 = 0; 
    public short U45 = 0; 
    public short U46 = 0; 
    public short U47 = 0;
    
    public String[] colNames = new String[] {  "NA",
                                        "NA",
                                        "NA",
                                        "NA",
                                        "NA",
                                        "NA",
                                        "NA",
                                        "NA",
                                        "NA",
                                        "NA",
                                        "NA",
                                        "NA",
                                        "NA",
                                        "NA",
                                        "NA",
                                        "NA"};
    

    public iffAuxPart(byte[] inData) {
        super();
        buildColNames();
        try {
            getItem(inData);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public iffAuxPart(String[] inData) {
        super();
        buildColNames();
        getItem(inData);
    }

    public iffAuxPart() {
        super();
        buildColNames();
    }

    private void buildColNames() {
        List<String> temp = new ArrayList<String>(super.getColNum() + this.getColNum());
        temp.addAll(Arrays.asList(super.colNames));
        temp.addAll(Arrays.asList(this.colNames));
        this.colNames = (String[]) temp.toArray(new String[temp.size()]);
        temp.clear();
        temp = null;
    }

    @Override
    public void getItem(String[] inData) {
        super.getItem(inData);
        this.U14 = uData.getShort(Integer.parseInt(inData[33]));
        this.U33 = uData.getShort(Integer.parseInt(inData[34]));
        this.U34 = uData.getShort(Integer.parseInt(inData[35]));
        this.U35 = uData.getShort(Integer.parseInt(inData[36]));
        this.U36 = uData.getShort(Integer.parseInt(inData[37]));
        this.U37 = uData.getShort(Integer.parseInt(inData[38]));
        this.U38 = uData.getShort(Integer.parseInt(inData[39]));
        this.U39 = uData.getShort(Integer.parseInt(inData[40]));
        this.U40 = uData.getShort(Integer.parseInt(inData[41]));
        this.U41 = uData.getShort(Integer.parseInt(inData[42]));
        this.U42 = uData.getShort(Integer.parseInt(inData[43]));
        this.U43 = uData.getShort(Integer.parseInt(inData[44]));
        this.U44 = uData.getShort(Integer.parseInt(inData[45]));
        this.U45 = uData.getShort(Integer.parseInt(inData[46]));
        this.U46 = uData.getShort(Integer.parseInt(inData[47]));
        this.U47 = uData.getShort(Integer.parseInt(inData[48]));
    }

    @Override
    public final void getItem(byte[] inData) throws IOException {
        try {
            super.getItem(inData);
            this.U14 = uData.getShort(new byte[]{inData[144], inData[145]});
            this.U33 = uData.getShort(new byte[]{inData[146], inData[147]});
            this.U34 = uData.getShort(new byte[]{inData[148], inData[149]});
            this.U35 = uData.getShort(new byte[]{inData[150], inData[151]});
            this.U36 = uData.getShort(new byte[]{inData[152], inData[153]});
            this.U37 = uData.getShort(new byte[]{inData[154], inData[155]});
            this.U38 = uData.getShort(new byte[]{inData[156], inData[157]});
            this.U39 = uData.getShort(new byte[]{inData[158], inData[159]});
            this.U40 = uData.getShort(new byte[]{inData[160], inData[161]});
            this.U41 = uData.getShort(new byte[]{inData[162], inData[163]});
            this.U42 = uData.getShort(new byte[]{inData[164], inData[165]});
            this.U43 = uData.getShort(new byte[]{inData[166], inData[167]});
            this.U44 = uData.getShort(new byte[]{inData[168], inData[169]});
            this.U45 = uData.getShort(new byte[]{inData[170], inData[171]});
            this.U46 = uData.getShort(new byte[]{inData[172], inData[173]});
            this.U47 = uData.getShort(new byte[]{inData[174], inData[175]});
        } catch (IOException ex) {
            throw new IOException(ex);
        }
    }

    @Override
    public int getColNum() {
        return this.colNames.length;
    }

    @Override
    public String getTitle(int titleIndex) {
        return colNames[titleIndex];
    }
        
    @Override
    public Object getValue(int colIndex) {
        if (colIndex < super.getColNum()) {
            return super.getValue(colIndex);
        }
        else {
            switch (colIndex) {
                case base:
                    return uData.getInt(this.U14);
                case (base+1):
                    return uData.getInt(this.U33);
                case (base+2):
                    return uData.getInt(this.U34);
                case (base+3):
                    return uData.getInt(this.U35);
                case (base+4):
                    return uData.getInt(this.U36);
                case (base+5):
                    return uData.getInt(this.U37);
                case (base+6):
                    return uData.getInt(this.U38);
                case (base+7):
                    return uData.getInt(this.U39);
                case (base+8):
                    return uData.getInt(this.U40);
                case (base+9):
                    return uData.getInt(this.U41);
                case (base+10):
                    return uData.getInt(this.U42);
                case (base+11):
                    return uData.getInt(this.U43);
                case (base+12):
                    return uData.getInt(this.U44);
                case (base+13):
                    return uData.getInt(this.U45);
                case (base+14):
                    return uData.getInt(this.U46);
                case (base+15):
                    return uData.getInt(this.U47);
                default:
                    // Return something that easily can identify missed values
                    return "&";
            }
        }
    }

    @Override
    public void setValue(int colIndex, Object value) {
        if (colIndex <= super.getColNum()) {
            super.setValue(colIndex, value);
        }
        else {
            switch (colIndex) {
                case base:
                    this.U14 = uData.getShort((Integer)value);
                    break;
                case (base+1):
                    this.U33 = uData.getShort((Integer)value);
                    break;
                case (base+2):
                    this.U34 = uData.getShort((Integer)value);
                    break;
                case (base+3):
                    this.U35 = uData.getShort((Integer)value);
                    break;
                case (base+4):
                    this.U36 = uData.getShort((Integer)value);
                    break;
                case (base+5):
                    this.U37 = uData.getShort((Integer)value);
                    break;
                case (base+6):
                    this.U38 = uData.getShort((Integer)value);
                    break;
                case (base+7):
                    this.U39 = uData.getShort((Integer)value);
                    break;
                case (base+8):
                    this.U40 = uData.getShort((Integer)value);
                    break;
                case (base+9):
                    this.U41 = uData.getShort((Integer)value);
                    break;
                case (base+10):
                    this.U42 = uData.getShort((Integer)value);
                    break;
                case (base+11):
                    this.U43 = uData.getShort((Integer)value);
                    break;
                case (base+12):
                    this.U44 = uData.getShort((Integer)value);
                    break;
                case (base+13):
                    this.U45 = uData.getShort((Integer)value);
                    break;
                case (base+14):
                    this.U46 = uData.getShort((Integer)value);
                    break;
                case (base+15):
                    this.U47 = uData.getShort((Integer)value);
                    break;
            }
        }
    }
}
