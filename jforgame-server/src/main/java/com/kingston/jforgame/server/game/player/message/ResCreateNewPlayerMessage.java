package com.kingston.jforgame.server.game.player.message;

import com.kingston.jforgame.server.game.Modules;
import com.kingston.jforgame.server.game.player.PlayerDataPool;
import com.kingston.jforgame.socket.annotation.MessageMeta;
import com.kingston.jforgame.socket.message.Message;

@MessageMeta(module=Modules.PLAYER, cmd= PlayerDataPool.RES_CREATE_PLAYER)
public class ResCreateNewPlayerMessage extends Message {

	private long playerId;

	public long getPlayerId() {
		return playerId;
	}

	public void setPlayerId(long playerId) {
		this.playerId = playerId;
	}

}
