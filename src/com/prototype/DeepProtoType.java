package com.prototype;

import java.io.*;

public class DeepProtoType implements Serializable,Cloneable {

	private static final long serialVersionUID = 1L;
	public String name;//string屬性
    public DeepCloneableTarget deepCloneableTarget;//引用類型

    public DeepProtoType() {
    }

    //深拷貝 -方式1 使用clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //這裡完成對基本數據類型（屬性）和String類型的克隆
        deep = super.clone();
        //對應用類型的屬性，進行單獨處理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deepProtoType;
    }


    //深拷貝-方式2 通過對象的序列化實現（推薦）
    public Object deepClone(){
        //定義流對象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
        	//創建流對象
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);//當前這個對像以對象流的方式輸出

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType) ois.readObject();
            return copyObj;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
