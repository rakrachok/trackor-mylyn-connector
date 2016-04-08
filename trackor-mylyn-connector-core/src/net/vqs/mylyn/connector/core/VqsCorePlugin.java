package net.vqs.mylyn.connector.core;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class VqsCorePlugin extends Plugin {

    public static final String PLUGIN_ID = "net.vqs.mylyn.connector.core"; //$NON-NLS-1$

    public static final String CONNECTOR_KIND = "net.vqs.mylyn.connector"; //$NON-NLS-1$

    private static VqsCorePlugin plugin;

    public VqsCorePlugin() {
    }

    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    public static VqsCorePlugin getDefault() {
        return plugin;
    }
}