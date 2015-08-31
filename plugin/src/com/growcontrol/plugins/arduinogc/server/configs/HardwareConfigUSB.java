package com.growcontrol.plugins.arduinogc.server.configs;

import com.growcontrol.plugins.arduinogc.PluginDefines;
import com.poixson.commonapp.config.xConfig;


public class HardwareConfigUSB extends HardwareConfig {

	public final String port;
	public final int    baud;



	public HardwareConfigUSB(final xConfig config) {
		super(config);
		this.port = config.getString(PluginDefines.CONFIG_HARDWARE_USB_PORT);
		this.baud = config.getInt(   PluginDefines.CONFIG_HARDWARE_USB_BAUD,
				PluginDefines.DEFAULT_USB_BAUD);
	}



	@Override
	protected String genKey() {
		final StringBuilder str = new StringBuilder();
		str.append(this.port)
			.append(':').append(this.baud)
			.append(":#").append(this.id);
		return str.toString();
	}



}
