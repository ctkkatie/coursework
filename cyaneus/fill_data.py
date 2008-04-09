from live.models import *
from datetime import datetime

game = Game()
game.name = u"?�a"
game.put()

a = Team()
a.name = u"��?"
a.put()

b = Team()
b.name = u"??"
b.put()

channel = Channel()
channel.name = u"??�^�|"
channel.put()

tool = Tool()
tool.name = "SopCast"
tool.put()

method = Method()
method.tool = tool
method.channel = channel
method.reference = "sop://broker1.sopcast.com:3912/6543"
method.put()

match = Match()
teams = []
teams.append(a.key())
teams.append(b.key())
channels = []
channels.append(channel.key())
match.game = game
match.begin_time = datetime(2008, 4, 9, 10, 45)
match.teams = teams
match.channels = channels
match.put()
