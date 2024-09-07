'use server';
import SgrEntity from "@/data/SgrEntity";
import fetchFromBackendApi from "@/utils/fetch-utils";

async function fetchSgrEntities() {
  return fetchFromBackendApi(`/sgr/all`);
}

export default async function SgrTechTest() {

  const sgrEntities: SgrEntity[] = await fetchSgrEntities();

  return sgrEntities.map(sgrEntity => 
    <div key={sgrEntity.id}>{sgrEntity.id} : {sgrEntity.sgrString}</div>
  );
}
