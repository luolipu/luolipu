package ZuulCommands;

import Character.Player;
import Commands.ACommand;

public class BackCommand extends ACommand {

  @Override
  public boolean execute(Player player) {

    if (player.R != null && player.R.size() != 0) {
      String direction = player.R.get(player.R.size() - 1);
      player.R.remove(player.R.size() - 1);
      if (direction.equals("north")) {
        direction = "south";
      } else if (direction.equals("south")) {
        direction = "north";
      } else if (direction.equals("west")) {
        direction = "east";
      } else if (direction.equals("east")) {
        direction = "west";
      }
      player.goRoom(direction);
      // System.out.println(player.R);观察方向列表变化
    }

    return false;
  }
}
