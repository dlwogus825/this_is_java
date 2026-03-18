package com.mjc813.server;

import com.mjc813.user.ChatUser;

public interface ServerChatInterface {
    void removeChatUser(com.mjc813.server.ServerChatSocket cu);
    void sendAllClients(String msg);
}
