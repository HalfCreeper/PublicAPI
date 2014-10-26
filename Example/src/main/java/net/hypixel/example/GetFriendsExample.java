package net.hypixel.example;

import net.hypixel.api.HypixelAPI;
import net.hypixel.api.reply.FriendsReply;
import net.hypixel.api.util.Callback;

import java.util.UUID;

public class GetFriendsExample {
    public static void main(String[] args) {
        HypixelAPI.getInstance().setApiKey(UUID.fromString("64bd424e-ccb0-42ed-8b66-6e42a135afb4"));
        HypixelAPI.getInstance().getFriends("AgentKid", new Callback<FriendsReply>(FriendsReply.class) {
            @Override
            public void callback(Throwable failCause, FriendsReply result) {
                if(failCause!=null) {
                    failCause.printStackTrace();
                } else {
                    System.out.println(result);
                }
                HypixelAPI.getInstance().finish();
            }
        });
    }
}
