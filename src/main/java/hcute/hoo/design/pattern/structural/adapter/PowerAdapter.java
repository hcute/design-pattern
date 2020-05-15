package hcute.hoo.design.pattern.structural.adapter;

public class PowerAdapter implements DC5{
    private AC220 ac220 = new AC220();
    @Override
    public int outputDC5V() {
        int inputACC = ac220.outputAC220V();
        // 使用变压器...
        int outputACC = inputACC/44;
        System.out.println("输入：" + inputACC + "输出:" + outputACC);
        return outputACC;
    }
}
