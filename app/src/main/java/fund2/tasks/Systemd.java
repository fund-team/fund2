package fund2.tasks;

import fund2.App;

/**
 * Class containing static methods dealing with systemd systems. Each action is
 * transposed into a static method returning a CMdTask "storing" the
 * corresponding console command.
 */

public class Systemd {

    public static Task start(String service) {
        return new CmdTask("systemctl start " + service);
    }

    public static Task stop(String service) {
        return new CmdTask("systemctl stop " + service);
    }

    public static Task restart(String service) {
        if (App.dotenv.get("DEBUG").equals("true")) {
            return new EmptyTask();
        }
        return new CmdTask("systemctl restart " + service);
    }
}
