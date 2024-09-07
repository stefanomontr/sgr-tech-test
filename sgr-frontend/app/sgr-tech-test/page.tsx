'use server';
import CreateSgrEntityForm from "@/components/CreateSgrEntityForm";
import SgrEntityList from "@/components/SgrEntityList";
import SgrEntity from "@/data/SgrEntity";
import fetchFromBackendApi from "@/utils/fetch-utils";

async function fetchSgrEntities() {
  return fetchFromBackendApi<SgrEntity[]>(`/sgr/all`, { cache: 'no-store' });
}

export default async function SgrTechTest() {

  const sgrEntities = await fetchSgrEntities();

  return (
    <div>
      <SgrEntityList sgrEntities={sgrEntities} />
      <CreateSgrEntityForm />
    </div>
  );
}
