package OOP.InterfacesAndAbstraction.MilitaryElite;

import OOP.InterfacesAndAbstraction.MilitaryElite.Military.entities.*;
import OOP.InterfacesAndAbstraction.MilitaryElite.Military.enums.Corps;
import OOP.InterfacesAndAbstraction.MilitaryElite.Military.interfaces.*;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Private> soldiersById = new LinkedHashMap<>();
    private static Map<Integer, Spy> spiesById = new LinkedHashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        while (!input.equals("End")) {
            Private soldier = createSoldier(input);

            if (soldier != null) {
                soldiersById.put(soldier.getId(), soldier);
            }

            input = scanner.nextLine();
        }

        for (Soldier value : soldiersById.values()) {
            System.out.println(value.toString());
        }


    }

    private static Private createSoldier(String input) {
        String[] tokens = input.split("\\s+");
        String type = tokens[0];

        Private aPrivate;

        switch (type) {
            case "Private":
                aPrivate = new PrivateImpl(Integer.parseInt(tokens[1])
                        , tokens[2]
                        , tokens[3]
                        , Double.parseDouble(tokens[4]));
                break;
            case "LieutenantGeneral":
                aPrivate = createLiuetenantGeneral(tokens);
                break;
            case "Engineer":
                aPrivate = createEngineer(tokens);
                break;
            case "Commando":
                aPrivate = createCommando(tokens);
                break;
            case "Spy":
                spiesById.put(Integer.parseInt(tokens[1]), new SpyImpl(Integer.parseInt(tokens[1])
                        , tokens[2]
                        , tokens[3]
                        , tokens[4]));
            default:
                aPrivate = null;
                break;


        }

        return aPrivate;
    }

    private static Private createCommando(String[] tokens) {
        String corps = tokens[5];
        if (corps.equals("Airforces") || corps.equals("Marines")) {
            Commando commando = new CommandoImpl(Integer.parseInt(tokens[1])
                    , tokens[2]
                    , tokens[3]
                    , Double.parseDouble(tokens[4])
                    , Corps.valueOf(corps.toUpperCase()));

            for (int i = 6; i < tokens.length; i += 2) {
                String codeName = tokens[i];
                String state = tokens[i + 1];

                if (!state.equals("inProgress") && !state.equals("finished")) {
                    continue;
                }

                Mission mission = new MissionImpl(codeName, state.equals("inProgress") ?
                        MissionImpl.Status.IN_PROGRESS
                        : MissionImpl.Status.FINISHED);
                commando.addMission(mission);
            }
            return commando;
        }


        return null;
    }

    private static Private createEngineer(String[] tokens) {
        String corps = tokens[5];
        if (corps.equals("Airforces") || corps.equals("Marines")) {
            Engineer engineer = new EngineerImpl(Integer.parseInt(tokens[1])
                    , tokens[2]
                    , tokens[3]
                    , Double.parseDouble(tokens[4])
                    , Corps.valueOf(corps.toUpperCase()));

            for (int i = 6; i < tokens.length; i += 2) {
                String partName = tokens[i];
                int hoursWorked = Integer.parseInt(tokens[i] + 1);
                Repair repair = new RepairImpl(partName, hoursWorked);
                engineer.addRepair(repair);
            }
            return engineer;
        }

        return null;
    }

    private static Private createLiuetenantGeneral(String[] tokens) {
        LieutenantGeneral lieutenantGeneral = new LieutenantGeneralImpl(Integer.parseInt(tokens[1])
                , tokens[2]
                , tokens[3]
                , Double.parseDouble(tokens[4]));

        for (int i = 5; i < tokens.length; i++) {
            lieutenantGeneral.addPrivate(soldiersById.get(Integer.parseInt(tokens[i])));
        }

        return lieutenantGeneral;
    }
}
