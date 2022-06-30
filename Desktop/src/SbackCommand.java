package ZuulCommands;

import Commands.ACommand;
import Character.Player;
// 高级返回
public class SbackCommand extends ACommand {
  @Override
  public boolean execute(Player player) {
    if (player.R != null && player.R.size() != 0) {
      int i = 0;
      while (i < player.R.size()) {
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
        //            System.out.println(player.R);观察方向列表变化
      }
    }
    System.out.println("you are in the begining!");
    return false;
  }
}
