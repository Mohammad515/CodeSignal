bool variableName(std::string name) {

for(int i=0;i<name.size();i++)
{
if (name[i] != '_' && !(isdigit(name[i])) && (name[i] < 65 && name[i] ||( name[i]>90&& name[i] < 97) || name[i]>127))
{
return false;
}
}
if(isdigit(name[0]))
{
return false;
}
else
return true;

