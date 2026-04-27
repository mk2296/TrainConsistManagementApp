import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        boolean isSafetyCompliant = goodsBogies.stream()
                .allMatch(bogie -> !"Cylindrical".equals(bogie.type)
                        || "Petroleum".equals(bogie.cargo));

        System.out.println("Goods bogie count: " + goodsBogies.size());
        System.out.println("Train safety compliant: " + isSafetyCompliant);
    }
}