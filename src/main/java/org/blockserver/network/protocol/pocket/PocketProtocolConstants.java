package org.blockserver.network.protocol.pocket;

public interface PocketProtocolConstants{
	public final static byte RAKNET_BROADCAST_PING_1                = 0x01;
	public final static byte RAKNET_BROADCAST_PING_2                = 0x02;
	public final static byte RAKNET_OPEN_CONNECTION_REQUEST_1       = 0x05;
	public final static byte RAKNET_OPEN_CONNECTION_REPLY_1         = 0x06;
	public final static byte RAKNET_OPEN_CONNECTION_REQUEST_2       = 0x07;
	public final static byte RAKNET_OPEN_CONNECTION_REPLY_2         = 0x08;
	public final static byte RAKNET_INCOMPATIBLE_PROTOCOL_VERSION   = 0x1A;
	public final static byte RAKNET_BROADCAST_PONG_1                = 0x1C;
	public final static byte RAKNET_BROADCAST_PONG_2                = 0x1D;
	public final static byte RAKNET_CUSTOM_PACKET_MIN               = (byte) 0x80;
	public final static byte RAKNET_CUSTOM_PACKET_MAX               = (byte) 0x8F;
	public final static byte RAKNET_NACK                            = (byte) 0xA0;
	public final static byte RAKNET_ACK                             = (byte) 0xC0;
}
